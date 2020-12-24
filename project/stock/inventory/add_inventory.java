package project.stock.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import project.Payment.team.Hikariconfig;

public class add_inventory {
	String a = null;
	HikariDataSource ds = null;
	public add_inventory(String name) {
		ds = new Hikariconfig().config();

		try {
			Connection conn = ds.getConnection();

			PreparedStatement pstmt = conn
					.prepareStatement("select st_info,additional_inventory from shoes where sh_serial_number=?");

			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				a = String.format("재고수량:%d\n주문 가능수량:%d\n시리얼넘버:%s", rs.getInt("st_info"),
						 rs.getInt("additional_inventory"),name);
			}

			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public String info() {
		return a;
	}

}
