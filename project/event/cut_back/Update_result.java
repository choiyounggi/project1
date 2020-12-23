package project.event.cut_back;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update_result {

	public Update_result(String dpt_name) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			 Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1",
					"hr",
					"123"
			);
			
			String sql = "UPDATE employees3 SET salary = salary - 50000 WHERE department_id = ( SELECT department_id FROM departments3 WHERE department_name = ? )";

			PreparedStatement pstmt = 
					conn.prepareStatement(sql);
			
			pstmt.setString(1, dpt_name);
			
			int row = pstmt.executeUpdate();
			
			System.out.printf("%d행이 변경되었습니다.\n", row);
			System.out.printf("%s 직원들의 월급이 50000원 삭감되었습니다.", dpt_name);
		
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
	
}
