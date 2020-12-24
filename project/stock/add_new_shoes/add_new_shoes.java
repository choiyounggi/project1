package project.stock.add_new_shoes;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import project.Payment.team.Hikariconfig;
import project.custom.main.Frame01;

public class add_new_shoes {
	String a = null;
	HikariDataSource ds = null;
	
	
	
	public void add_new_shoess(String sh_serial_number,String br_storage_lct,  String sh_name, int sh_size, int st_info, int sh_price) {
	
		ds = new Hikariconfig().config();
		try {
			Connection conn = ds.getConnection();

			PreparedStatement pstmt = conn.prepareStatement(
					"insert into shoes values(?,?,?,?,?,?,waiting_num.nextval)");

			pstmt.setString(1, sh_serial_number);
			pstmt.setString(2, br_storage_lct);
			pstmt.setString(3, sh_name);
			pstmt.setInt(4, sh_size);
			pstmt.setInt(5, st_info);
			pstmt.setInt(6, sh_price);
			
			System.out.println("신규 상품 등록 완료");
			pstmt.executeUpdate();

			if (conn != null)
				conn.close();
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public String info() {
		return a;
	}

	public void storageInput(String sh_serial_number, String sh_name, int sh_size, int sh_info, int sh_price,
			String type) {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
		config.setUsername("hr");
		config.setPassword("123");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

		HikariDataSource ds = new HikariDataSource(config);

		try {
			Connection conn = ds.getConnection();
			String sql = "INSERT INTO storage_" + type + " values(?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sh_serial_number);
			pstmt.setString(2, sh_name);
			pstmt.setInt(3, sh_size);
			pstmt.setInt(4, sh_info);
			pstmt.setInt(5, sh_price);

			pstmt.executeUpdate();

			if (conn != null)
				conn.close();
			if (pstmt != null)
				pstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
