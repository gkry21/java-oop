package homeworks04_calendar;

import javax.swing.JOptionPane;

public class MyClendarController {
	public static void main(String[] args) {
		while(true) {
			MyCalendar mycalendar = new MyCalendar();
			MyCalendarService mcservice = new MyCalendarService();
			switch(JOptionPane.showInputDialog("0. 종료 1. 윤년계산기 2. 마지막날계산기")) {
			case "0" : break;
			case "1" :
			String year =	JOptionPane.showInputDialog("연도를 입력해주세요");
			mycalendar.setYear(Integer.parseInt(year));
			JOptionPane.showMessageDialog(null, mcservice.isLeapYear(mycalendar));
			break;
			case "2" : 
			String  month = JOptionPane.showInputDialog("궁금한 월을 입력해주세요");
			mycalendar.setMonth(Integer.parseInt(month));
			JOptionPane.showMessageDialog(null, mcservice.getEndDay(mycalendar));
			break;
			}
		}
	}
}