package project.attendance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Get_check_in_today {

	String checked_in = null;
	public Get_check_in_today(int emp_id, String check_date) {
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

	         PreparedStatement pstmt = conn.prepareStatement("SELECT check_in_time FROM attendance WHERE emp_id = ? AND check_date = ?");

	         pstmt.setInt(1, emp_id);
	         pstmt.setString(2, check_date);
	         
	         ResultSet rs = pstmt.executeQuery();

	         
	         while (rs.next()) {
	        	 checked_in = rs.getString("check_in_time");
	         }

	         rs.close();
	         pstmt.close();
	         conn.close();

	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	   }
	
	public String check_in() {
	      
	      return checked_in;
	   }
	
}
