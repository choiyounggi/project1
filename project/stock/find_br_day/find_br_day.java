package project.stock.find_br_day;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import project.Payment.team.Hikariconfig;
//브랜드 이름 넣으면 브랜드 고유번호랑 브랜드 행사 날짜 알려주는 기능
public class find_br_day {
	String a = null;
	HikariDataSource ds = null;
	public find_br_day(String name) {
		ds = new Hikariconfig().config();

		try {
			Connection conn = ds.getConnection();

			PreparedStatement pstmt = conn.prepareStatement("select br_event_day from brand where br_name=?");

			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				a = String.format("브랜드 데이:%s\n브랜드명:%s\n" , rs.getString("br_event_day"),name);
			}

			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public String imfo() {

		return a;
	}

}
