
/*
 * /*
 * To.개발자님께
초단위로 알려주는 시험이 있는데
이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.
 
 */
package study03;

import java.util.Scanner;

public class TimeCalc {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("초를 입력해주세요");
	int sec = scan.nextInt();
	int hh = 0;
	int mm = 0;
	int ss = 0;
	
	mm = sec / 60;
	hh = mm / 60;
	ss = sec - (mm*60);
	mm = mm - (hh*60);
	System.out.println( hh+"시간"+ mm+"분"+ ss+"초 입니다.");
	}
}
