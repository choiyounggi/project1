package project.custom.contoller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Properties;
import java.util.TimeZone;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import project.Payment.team.Hikariconfig;
import project.custom.panel.panelBlackIn;

public class Black_Controller {

	public static Integer id;
	public static String b_name;
	public static Integer b_age;
	public static String b_gender;
	public static String b_email;
	public static String b_phone;
	public static String b_addr;
	public static String b_card;
	public static String b_reason;
	public static String b_registration;
	HikariDataSource ds = null;
	public static ArrayList<String> mo = new ArrayList<String>();

	public Black_Controller() {
		ds = new Hikariconfig().config();
	}
	
	public void Black_CardInsert(String card) {
		try {
			Connection conn = ds.getConnection();
			String sql = "INSERT INTO blacklist values (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Custom_Select_Use_Black_Controller.id);
			pstmt.setString(2, Custom_Select_Use_Black_Controller.c_name);
			pstmt.setInt(3, Custom_Select_Use_Black_Controller.c_age);
			pstmt.setString(4, Custom_Select_Use_Black_Controller.c_gender);
			pstmt.setString(5, Custom_Select_Use_Black_Controller.c_phone);
			pstmt.setString(6, Custom_Select_Use_Black_Controller.c_email);
			pstmt.setString(7, Custom_Select_Use_Black_Controller.c_addr);
			pstmt.setString(8, Custom_Select_Use_Black_Controller.c_card);
//			pstmt.setString(9, Custom_Black_Input_View.reason.getText());
			pstmt.setString(9, panelBlackIn.reason.getText());
			pstmt.setString(10, getDate());

			System.out.println("카드 번호로 블랙리스트 등록 완료");
			pstmt.executeUpdate();
			String black = "BLACK";
			String sql2 = "UPDATE CUSTOM SET black_Whether = '" + black + "' WHERE CARD = ?";
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setString(1, card);
			System.out.println("회원 관리 저장소 BLACK 변환 완료");
			pstmt2.executeUpdate();

			if (pstmt != null)
				pstmt.close();
			if (pstmt2 != null)
				pstmt2.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void BlackCard_Select(String card) {

		Properties props = new Properties();
		props.setProperty("JdbcUrl", "jdbc:oracle:thin:@localhost:1521/XEPDB1");
		props.setProperty("dataSource.user", "hr");
		props.setProperty("dataSource.password", "123");
		props.setProperty("dataSource.databaseName", "XEPDB1");
		props.put("dataSource.logWriter", new PrintWriter(System.out));

		HikariConfig config = new HikariConfig(props);
		HikariDataSource ds = new HikariDataSource(config);

		try {
			Connection conn = ds.getConnection();
			String sql = "SELECT * FROM blacklist WHERE CARD = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, card);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.printf("고객Number%d\n이름:%s\n나이:%d\n성별:%s\n핸드폰:%s\n이메일:%s\n주소:%s\n카드번호:%s\n사유%s\n등록일%s",
						this.id = rs.getInt("id"), this.b_name = rs.getString("name"), this.b_age = rs.getInt("age"),
						this.b_gender = rs.getString("gender"), this.b_phone = rs.getString("phone"),
						this.b_email = rs.getString("email"), this.b_addr = rs.getString("addr"),
						this.b_card = rs.getString("card"), this.b_reason = rs.getString("reason"),
						this.b_registration = rs.getString("Registration_day"), this.mo.add(id.toString()),
						this.mo.add(b_name), this.mo.add(b_age.toString()), this.mo.add(b_gender), this.mo.add(b_phone),
						this.mo.add(b_email), this.mo.add(b_addr), this.mo.add(b_card), this.mo.add(b_reason),
						this.mo.add(b_registration));
//				System.out.println(mo);
			}

			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void BlackName_Select(String name) {
		
		Properties props = new Properties();
		props.setProperty("JdbcUrl", "jdbc:oracle:thin:@localhost:1521/XEPDB1");
		props.setProperty("dataSource.user", "hr");
		props.setProperty("dataSource.password", "123");
		props.setProperty("dataSource.databaseName", "XEPDB1");
		props.put("dataSource.logWriter", new PrintWriter(System.out));

		HikariConfig config = new HikariConfig(props);
		HikariDataSource ds = new HikariDataSource(config);

		try {
			Connection conn = ds.getConnection();
			String sql = "SELECT * FROM blacklist WHERE NAME = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.printf("고객Number%d\n이름:%s\n나이:%d\n성별:%s\n핸드폰:%s\n이메일:%s\n주소:%s\n카드번호:%s\n사유%s\n등록일%s",
						this.id = rs.getInt("id"), this.b_name = rs.getString("name"), this.b_age = rs.getInt("age"),
						this.b_gender = rs.getString("gender"), this.b_phone = rs.getString("phone"),
						this.b_email = rs.getString("email"), this.b_addr = rs.getString("addr"),
						this.b_card = rs.getString("card"), this.b_reason = rs.getString("reason"),
						this.b_registration = rs.getString("Registration_day"), this.mo.add(id.toString()),
						this.mo.add(b_name), this.mo.add(b_age.toString()), this.mo.add(b_gender), this.mo.add(b_phone),
						this.mo.add(b_email), this.mo.add(b_addr), this.mo.add(b_card), this.mo.add(b_reason),
						this.mo.add(b_registration));
//				System.out.println(mo);
			}

			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	public void BlackSelect_All() {

		Properties props = new Properties();
		props.setProperty("JdbcUrl", "jdbc:oracle:thin:@localhost:1521/XEPDB1");
		props.setProperty("dataSource.user", "hr");
		props.setProperty("dataSource.password", "123");
		props.setProperty("dataSource.databaseName", "XEPDB1");
		props.put("dataSource.logWriter", new PrintWriter(System.out));

		HikariConfig config = new HikariConfig(props);
		HikariDataSource ds = new HikariDataSource(config);

		try {
			Connection conn = ds.getConnection();
			String sql = "SELECT * FROM blacklist";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.printf("고객Number%d\n이름:%s\n나이:%d\n성별:%s\n핸드폰:%s\n이메일:%s\n주소:%s\n카드번호:%s\n사유%s\n등록일%s",
						this.id = rs.getInt("id"), this.b_name = rs.getString("name"), this.b_age = rs.getInt("age"),
						this.b_gender = rs.getString("gender"), this.b_phone = rs.getString("phone"),
						this.b_email = rs.getString("email"), this.b_addr = rs.getString("addr"),
						this.b_card = rs.getString("card"), this.b_reason = rs.getString("reason"),
						this.b_registration = rs.getString("Registration_day"), this.mo.add(id.toString()),
						this.mo.add(b_name), this.mo.add(b_age.toString()), this.mo.add(b_gender), this.mo.add(b_phone),
						this.mo.add(b_email), this.mo.add(b_addr), this.mo.add(b_card), this.mo.add(b_reason),
						this.mo.add(b_registration));
				
			}

			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public String getDate() {
		TimeZone korea = TimeZone.getTimeZone("Asia/Seoul");
		Calendar korea_time = Calendar.getInstance(korea);
		int korea_year = korea_time.get(Calendar.YEAR);
		int korea_month = korea_time.get(Calendar.MONTH) + 1;
		int korea_date = korea_time.get(Calendar.DATE);
		return korea_year + "/" + korea_month + "/" + korea_date;
	}
}
