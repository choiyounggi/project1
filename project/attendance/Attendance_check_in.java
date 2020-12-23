package project.attendance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Attendance_check_in {
	String result;
	
	public Attendance_check_in(int emp_id) {	
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			 Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1",
					"hr",
					"123"
			);
			
			String sql = "INSERT INTO attendance (check_date, check_in_time, emp_id, emp_name, attendance_check) VALUES (?, ?, ?, ?, ?)";

			PreparedStatement pstmt = 
					conn.prepareStatement(sql);
			String today = new Today().check_day();
			if (new Get_check_in_today(emp_id, today).checked_in == null) {
				if (new Get_name(emp_id).name() == null) {
					System.err.println("존재하지 않는 사원번호 입니다.");
					result = "[" + emp_id + "]번은 존재하지 않는 사원번호 입니다.";
				} else {
				pstmt.setString(1, new Attendance_ci().check_day());
				pstmt.setString(2, new Attendance_ci().check_time());
				pstmt.setInt(3, emp_id);
				pstmt.setString(4, new Get_name(emp_id).name());
				pstmt.setString(5, new Attendance_ci().attendance_result());
	
				int row = pstmt.executeUpdate();
				
				System.out.printf("%d행이 변경되었습니다.\n", row);
				System.out.println("출근이 완료되었습니다.");
				result = "[" + emp_id + "]번 사원의 " + "출근이 완료되었습니다.";
				}
			} else {
				System.err.println("이미 출근체크가 완료된 사원입니다.");
				result = "이미 출근체크가 완료된 사원입니다.";
			}
				
			
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String result() {
		
		return result;
	}

}
