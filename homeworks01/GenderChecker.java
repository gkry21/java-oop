package homeworks01;
import java.util.Scanner;
/**
다음은 우리나라 주민번호 체계입니다.
9 : 1800 ~ 1899년에 태어난 남성
0 : 1800 ~ 1899년에 태어난 여성
1 : 1900 ~ 1999년에 태어난 남성
2 : 1900 ~ 1999년에 태어난 여성
3 : 2000 ~ 2099년에 태어난 남성
4 : 2000 ~ 2099년에 태어난 여성
5 : 1900 ~ 1999년에 태어난 외국인 남성
6 : 1900 ~ 1999년에 태어난 외국인 여성
7 : 2000 ~ 2099년에 태어난 외국인 남성
8 : 2000 ~ 2099년에 태어난 외국인 여성

입력받은 주민등록번호를 가지고 상기 결과값이 나오도록 프로그램을 작성하시오.
String ssn = 900101-123456 이라고 주민등록번호를 입력받으면
String num = ssn.substring(7,8) 이라고 하면
1이 나옵니다
스트링 넘버가 1일 경우 답은 1900 ~ 1999년에 태어난 남성
*/

public class GenderChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하여 주십시오");
		
		String ans = scan.next();
		int flag = Integer.parseInt(ans.substring(7,8));
		String eval = "";
		
		switch (flag) {
		case 9 : eval = "1800 ~ 1899년에 태어난 남성"; break;
		case 0 : eval = "1800 ~ 1899년에 태어난 여성"; break;
		case 1 : eval = "1900 ~ 1999년에 태어난 남성"; break;
		case 2 : eval = "1900 ~ 1999년에 태어난 여성"; break;
		case 3 : eval = "2000 ~ 2099년에 태어난 남성"; break;
		case 4 : eval = "2000 ~ 2099년에 태어난 여성"; break;
		case 5 : eval = "1900 ~ 1999년에 태어난 외국인 남성"; break;
		case 6 : eval = "1900 ~ 1999년에 태어난 외국인 여성"; break;
		case 7 : eval = "2000 ~ 2099년에 태어난 외국인 남성"; break;
		case 8 : eval = "2000 ~ 2099년에 태어난 외국인 여성"; break;
		default : eval = "잘못 입력하셨습니다."; break;
		}
		System.out.println(eval);
	}

}
