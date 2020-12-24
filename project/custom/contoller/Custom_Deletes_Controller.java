package project.custom.contoller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import project.Payment.team.Hikariconfig;

public class Custom_Deletes_Controller {
	HikariDataSource ds = null;

	public Custom_Deletes_Controller() {
		ds = new Hikariconfig().config();
	}
	
	public void Delete(String card) {
		
	      try {
			Connection conn = ds.getConnection();
			
			
			String sql3 = "DELETE FROM blacklist WHERE CARD = ?";
			PreparedStatement pstmt3 = conn.prepareStatement(sql3);
			pstmt3.setString(1, card);
			System.out.println("블랙리스트 목록 삭제");
			pstmt3.executeUpdate();
			
			  String sql ="DELETE FROM CUSTOM WHERE CARD = ?"; 		  
		      PreparedStatement pstmt = conn.prepareStatement(sql);
		      pstmt.setString(1, card);
		      System.out.println("고객 삭제");		      
		      pstmt.executeUpdate();
		      
		      String sql2 = "DROP TABLE ABC"+card +" PURGE";
		      PreparedStatement pstmt2 = conn.prepareStatement(sql2);
		      System.out.println("고객 테이블 삭제");
		      pstmt2.executeUpdate();
		        if(pstmt != null) pstmt.close();
		        if(pstmt2 != null) pstmt2.close();
		        if(pstmt3 != null) pstmt3.close();
				if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
