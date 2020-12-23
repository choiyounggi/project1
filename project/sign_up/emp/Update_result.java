package project.sign_up.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update_result {

	String result;
	public Update_result(String emp_name, String emp_phone, int emp_age, int salary, String job_position, String division) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			 Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1",
					"hr",
					"123"
			);
			
			
			 
			if (new Sign_up_success(emp_phone).result() == 0) {
				String sql = "INSERT INTO employees3 VALUES (EMP_SEQ.NEXTVAL, ?, ?, null, ?, SYSDATE, ?, ?, null, ?)";

				PreparedStatement pstmt = 
							conn.prepareStatement(sql);
				
				pstmt.setString(1, emp_name);
				pstmt.setString(2, emp_phone);
				pstmt.setInt(3, emp_age);
				pstmt.setInt(4, salary);
				pstmt.setString(5, job_position);
				pstmt.setString(6, division);
				
				int row = pstmt.executeUpdate();
				System.out.printf("%d행이 변경되었습니다.\n", row);
				
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
				
				result = String.format("[%s]님의 사원 등록이 완료되었습니다.\n\n", emp_name);
			} else if (new Sign_up_success(emp_phone).result() > 0) {
				
				result = "이미 존재하는 사원입니다.\n\n";
			}
			
			
			
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
