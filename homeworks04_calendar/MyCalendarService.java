package homeworks04_calendar;

public class MyCalendarService {
	public String getEndDay(MyCalendar mycalendar) {
		String endDay = "";
		int month = mycalendar.getMonth();
		int eval = 0;
		switch(month) {
		case 1 : eval = 31; break;
		case 2 : eval = 29; break;
		case 3 : eval = 31; break;
		case 4 : eval = 30; break;
		case 5 : eval = 31; break;
		case 6 : eval = 30; break;
		case 7 : eval = 31; break;
		case 8 : eval = 31; break;
		case 9 : eval = 30; break;
		case 10 : eval = 31; break;
		case 11 : eval = 30; break;
		case 12 : eval = 31; break;
		}
		endDay = month + "월은" + eval +"일 까지 입니다.";
		return endDay;
	}
	public String isLeapYear(MyCalendar mycalendar) {
		String leapYear = "";
		int year = mycalendar.getYear();
		String eval = "";
		
		if(year%4==0) {
			eval = "윤년";
			if(year%100==0) {
				eval = "평년";
				if(year%400==0) {
					eval = "윤년";
				}
			}
		}
		else {eval = "평년";}
		leapYear = year+"년은"+ eval +"입니다.";
		return leapYear;
	}
}