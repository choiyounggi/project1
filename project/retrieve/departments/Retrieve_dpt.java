package project.retrieve.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Retrieve_dpt {

	String dpt_info = null;
	   public Retrieve_dpt(int dpt_id) {
	      HikariConfig config = new HikariConfig();
	      config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
	      config.setUsername("hr");
	      config.setPassword("1234");
	      config.addDataSourceProperty("cachePrepStmts", "true");
	      config.addDataSourceProperty("prepStmtCacheSize", "250");
	      config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

	      HikariDataSource ds = new HikariDataSource(config);
	      
	      try {
	         Connection conn = ds.getConnection();

	         PreparedStatement pstmt = conn.prepareStatement("SELECT d.department_name, e.manager_id, e.emp_name, e.emp_phone FROM departments3 d INNER JOIN employees3 e USING ( department_id ) WHERE department_id = ?");

	         pstmt.setInt(1, dpt_id);
	         
	         ResultSet rs = pstmt.executeQuery();

	         
	         while (rs.next()) {
	        	 dpt_info = String.format("[" + dpt_id + "�� �μ�]�� ����\n" + "�μ� �̸�: %s\n�Ŵ���ID: %d\n�Ŵ��� �̸�: %s\n��ȭ��ȣ: %s\n\n--------------------------------------------------------------------------------------------------", 
	            		rs.getString("department_name"),
	            		rs.getInt("manager_id"),
	            		rs.getString("emp_name"),
	            		rs.getString("emp_phone"));
	         }
	         
	         if (dpt_info == null) {
	        	 dpt_info = "[" + dpt_id + "�� �μ�]�� �������� �ʴ� �μ��Դϴ�.\n\n--------------------------------------------------------------------------------------------------";
	         }

	         rs.close();
	         pstmt.close();
	         conn.close();

	      } catch (SQLException e) {
	         e.printStackTrace();
	      }      
	   }
	   
	   public String info() {
	      
	      return dpt_info;
	   }
	
}