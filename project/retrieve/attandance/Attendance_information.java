package project.retrieve.attandance;

import java.sql.Connection;
import project.attendance.Get_name;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Attendance_information {
	
	String attendance_check = null;

	public Attendance_information(int emp_id, String check_date) {
		// ��� ��ȣ�� ��¥ �Է� �� ����, ����, �Ἦ ���� ���
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
			pstmt.setString(2, check_date);
			

			ResultSet rs = pstmt.executeQuery();

			
			while (rs.next()) {
				attendance_check = "[" + emp_id + "]�� ����� " + check_date + " �⼮ ���� : "  + rs.getString("attendance_check");
			}
			if (new Get_name(emp_id).name == null) {
				attendance_check = "�������� �ʴ� �����ȣ �Դϴ�.";
			} else if (attendance_check == null) {
				attendance_check = String.format("%s�� %d�� ����� ��� ����� �������� �ʽ��ϴ�.", check_date, emp_id);
			}

			rs.close();
			pstmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String result() {
		
		return attendance_check;
	}
	
}
