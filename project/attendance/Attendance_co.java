package project.attendance;

import java.util.Calendar;

public class Attendance_co {
	Calendar cal = Calendar.getInstance();
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH) + 1;
	int day = cal.get(Calendar.DAY_OF_MONTH);
	int hour = cal.get(Calendar.HOUR_OF_DAY);
	int min = cal.get(Calendar.MINUTE);
	int count = 0;
	// count 0: 정상, 1: 지각, 2: 결석
	String date = String.format("%d%d%d%d%d%d", year, month, day, hour, min, count);
	
	public Attendance_co() {		
		if (hour < 24 && hour >= 0 && min < 60 && min >= 0) {
			if (!((hour == 17 && min >= 50) || hour > 17)) {
				count += 1;
			} else {
				count = 0;
			}
		}
	}
	
	public String check_time() {

		return String.format("%d시%d분", hour, min);
	}
	
	public String attendance_result() {	
		if (count == 0) {
			return "정상";
		} else {
			return "결석";
		}
	}
}












