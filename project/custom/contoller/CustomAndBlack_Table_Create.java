package project.custom.contoller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import project.Payment.team.Hikariconfig;

public class CustomAndBlack_Table_Create {
	HikariDataSource ds = null;
		String practiceType;
	  public CustomAndBlack_Table_Create(String startOrEnd) {
		  this.practiceType = startOrEnd;
		  if(practiceType.equalsIgnoreCase("start")) {
			  ds = new Hikariconfig().config();
	      try {
			Connection conn = ds.getConnection();
			String sql = "CREATE TABLE CUSTOM ("
					+ "ID NUMBER(10) CONSTRAINT CUSTOM_CID_PK PRIMARY KEY,"
					+ "NAME VARCHAR2(10) CONSTRAINT CUSTOM_CNAME_NN NOT NULL,"
					+ "AGE NUMBER(10) CONSTRAINT CUSTOM_CAGE_NN NOT NULL,"
					+ "GENDER VARCHAR2(3) CONSTRAINT CUSTOM_CHENDER_NN NOT NULL "
					+ "CONSTRAINT CUSTOM_CGENDER_CHK CHECK(GENDER IN('³²','¿©')),"
					+ "PHONE VARCHAR2 (30) CONSTRAINT CUSTOM_CPHONE_NN NOT NULL "
					+ "CONSTRAINT CUSTOM_CPHONE_UK UNIQUE,"
					+ "EMAIL VARCHAR2 (50) CONSTRAINT CUSTOM_CEMAIL_NN NOT NULL "
					+ "CONSTRAINT  CUSTOM_CEMAIL_UK UNIQUE,"
					+ "ADDR VARCHAR2 (50)  NOT NULL,"
					+ "CARD VARCHAR2 (30) CONSTRAINT CUSTOM_CARD_UK UNIQUE,"
					+ "BLACK_WHETHER VARCHAR2(8) not null)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			
			String sql2 = "CREATE TABLE BLACKLIST ("
						+ "ID NUMBER (10) CONSTRAINT BLACK_ID_FK REFERENCES CUSTOM(ID),"
						+ "NAME VARCHAR2 (10),"
						+ "AGE NUMBER (10),"
						+ "GENDER VARCHAR2 (3),"
						+ "PHONE VARCHAR2 (30),"
						+ "EMAIL VARCHAR2 (30) ,"
						+ "ADDR VARCHAR2 (50) ,"
						+ "CARD VARCHAR2 (30) CONSTRAINT BLACK_BCARD_FK REFERENCES CUSTOM(card)"
						+ "CONSTRAINT BLACK_BCARD_UK UNIQUE,"
						+ "REASON VARCHAR2(40) NOT NULL,"
						+ "REGISTRATION_DAY VARCHAR2 (30) NOT NULL)";
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			pstmt2.executeUpdate();
			
			if(pstmt != null) pstmt.close();	
			if(pstmt2 != null) pstmt.close();	
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		  }else if (practiceType.equalsIgnoreCase("end")){
			  return;
		  }
	      
	      
	      
	      
	      
	      
	}
	
}
