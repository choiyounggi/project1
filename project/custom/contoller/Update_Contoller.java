package project.custom.contoller;

import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.JTextField;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import project.Payment.team.Hikariconfig;


public class Update_Contoller {
	HikariDataSource ds = null;
	
	public Update_Contoller() {
		ds = new Hikariconfig().config();
	}
	public void Update_Modify( String textName, String tGender, int textAge,String textPon,
			String textEmail01, String textAddr, String textSearch)  {
		try {

			Connection conn = ds.getConnection();
			String sql = "UPDATE CUSTOM SET name = ?, age = ?, gender =?,"
					+ "phone = ?, email = ?, addr = ? where card = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, textName);
			pstmt.setInt(2, textAge);
			pstmt.setString(3, tGender);
			pstmt.setString(4, textPon);
			pstmt.setString(5, textEmail01);
			pstmt.setString(6, textAddr);
			pstmt.setString(7, textSearch);
			pstmt.executeUpdate();

			String sql2 = "UPDATE blacklist SET name = ?, age = ?, gender =?,"
					+ "phone = ?, email = ?, addr = ? where card = ?";
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setString(1, textName);
			pstmt2.setInt(2, textAge);
			pstmt2.setString(3, tGender);
			pstmt2.setString(4, textPon);
			pstmt2.setString(5, textEmail01);
			pstmt2.setString(6, textAddr);
			pstmt2.setString(7, textSearch);
			pstmt2.executeUpdate();

			if (pstmt != null)
				pstmt.close();
			if (pstmt2 != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
