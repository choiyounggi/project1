package project.sign_up.dpt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import project.sign_up.emp.Sign_up_success;

public class Update_result {
	String result;

	public Update_result(String department_name, int manager_id) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			 Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1",
					"hr",
					"123"
			);			
			
			 
			if (new Sign_up_success(department_name).result() == 0) {
				String sql = "INSERT INTO departments3 VALUES (DPT_SEQ.NEXTVAL, ?, ?)";

				PreparedStatement pstmt = 
							conn.prepareStatement(sql);
				
				pstmt.setString(1, department_name);
				pstmt.setInt(2, manager_id);
				
				int row = pstmt.executeUpdate();
				System.out.printf("%d���� ����Ǿ����ϴ�.\n", row);
				
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
				
				result = String.format("[%s]�μ� ����� �Ϸ�Ǿ����ϴ�.\n\n", department_name);
			} else if (new Sign_up_success(department_name).result() > 0) {
				
				result = "�̹� �����ϴ� �μ��Դϴ�.\n\n";
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
