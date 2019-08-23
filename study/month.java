package study;
import java.util.Date;
import java.text.SimpleDateFormat;

public class month {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		String now = sdf.format(date);
		System.out.println(now);
		int month = Integer.parseInt(now.substring(5,7));
		String eval = "";
		switch (month) {
		case 1 : eval = "1월"; break;
		case 2 : eval = "2월"; break;
		case 3 : eval = "3월"; break;
		case 4 : eval = "4월"; break;
		case 5 : eval = "5월"; break;
		case 6 : eval = "6월"; break;
		case 7 : eval = "7월"; break;
		case 8 : eval = "8월"; break;
		case 9 : eval = "9월"; break;
		case 10 : eval = "10월"; break;
		case 11 : eval = "11월"; break;
		case 12 : eval = "12월"; break;
		default : eval = "오류입니다.";
		}
		System.out.println(eval);
}
}