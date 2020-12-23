package project.sign_up.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Sign_up_success {
	int result = 0;

	public Sign_up_success(String emp_phone) {
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

			PreparedStatement pstmt = conn.prepareStatement("SELECT emp_id FROM employees3 WHERE emp_phone = ?");

			pstmt.setString(1, emp_phone);

			ResultSet rs = pstmt.executeQuery();

			
			while (rs.next()) {
				result = rs.getInt("emp_id");
			}

			rs.close();
			pstmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int result() {
		
		return result;
	}
	
}
