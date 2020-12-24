package project.custom.contoller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import project.Payment.team.Hikariconfig;

public class CustomAndBlack_Table_Delete {
	String practiceType;
	HikariDataSource ds = null;
	public CustomAndBlack_Table_Delete(String startOrEnd) {
		this.practiceType = startOrEnd;
		ds = new Hikariconfig().config();
		  if(practiceType.equalsIgnoreCase("start")) {
		  
	
	 		try {
	 			
				Connection conn = ds.getConnection();
				
				String sql= "DROP TABLE BLACKLIST";		
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.executeUpdate();
				String sql2 = "DROP TABLE CUSTOM";
				PreparedStatement pstmt2 = conn.prepareStatement(sql2);
				pstmt2.executeUpdate();
				String sql3 = "PURGE RECYCLEBIN";
				PreparedStatement pstmt3 = conn.prepareStatement(sql3);
				pstmt3.executeUpdate();
				
				if(pstmt != null) pstmt.close();	
				if(pstmt2 != null) pstmt.close();	
				if(pstmt3 != null) pstmt.close();	
				if(conn != null) conn.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		  }else if (practiceType.equalsIgnoreCase("end")){
			  return;
		  }
	}
	
}
