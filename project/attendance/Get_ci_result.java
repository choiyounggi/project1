package project.attendance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Get_ci_result {

	String check = null;
	
	public Get_ci_result(int emp_id) {	
		
		HikariConfig config = new HikariConfig();
	      config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
	      config.setUsername("hr");
	      config.setPassword("123");
	      config.addDataSourceProperty("cachePrepStmts", "true");
	      config.addDataSourceProperty("prepStmtCacheSize", "250");
	      config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

	      HikariDataSource ds = new HikariDataSource(config);
	      
	      try {
	         Connection conn = ds.getConnection();

	         PreparedStatement pstmt = conn.prepareStatement("SELECT attendance_check FROM attendance WHERE emp_id = ? AND check_date = ?");

	         pstmt.setInt(1, emp_id);
	         pstmt.setString(2, new Attendance_ci().check_day());
	         
	         ResultSet rs = pstmt.executeQuery();

	         
	         while (rs.next()) {
	            check = rs.getString("attendance_check");
	         }

	         rs.close();
	         pstmt.close();
	         conn.close();

	      } catch (SQLException e) {
	         e.printStackTrace();
	      }      
	}
	
	public String check() {
		
		return check;
	}
}
