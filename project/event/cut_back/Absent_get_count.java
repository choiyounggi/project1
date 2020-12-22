package project.event.cut_back;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Absent_get_count {
	ArrayList<String> dpt_names = new ArrayList<>();
	ArrayList<Integer> counts = new ArrayList<>();
	ArrayList<Integer> indexs = new ArrayList<>();
	
	int max_value = 0;
	int max_index = 0;

	public Absent_get_count() {
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XEPDB1");
		config.setUsername("hr");
		config.setPassword("1234");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

		HikariDataSource ds = new HikariDataSource(config);

		try {
			Connection conn = ds.getConnection();

			PreparedStatement pstmt = conn.prepareStatement(
					"SELECT department_name, count(attendance_check) FROM attendance a, employees3 e, departments3 d WHERE a.emp_id = e.emp_id AND e.department_id = d.department_id AND attendance_check = '결석' GROUP BY department_name");

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				dpt_names.add(rs.getString("department_name"));
				counts.add(rs.getInt("count(attendance_check)"));
			}

			rs.close();
			pstmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < counts.size(); ++i) {
			if (counts.get(i) > max_value) {
				max_value = counts.get(i);
			}
		}
		
		for (int i = 0; i < counts.size(); ++i) {
			if (max_value == counts.get(i)) {
				indexs.add(i);
			}
		}
		
	}

	public String max_dpt_nav() {
		String result = "[결석자 수]\n";
		for (int i = 0; i < indexs.size(); ++i) {
			String d_name = dpt_names.get(indexs.get(i));
			int count = counts.get(indexs.get(i));
			
			result = result + String.format("%s : %d명\n", d_name, count);
		}
		return result;
	}

}
