package homeworks01;
/**
* 가위바위보에서
* Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다.
* 컴퓨터가 만든 값이 1이면 가위를 낸 것이고
* 2이면 바위를 낸 것이고
* 3이면 보를 낸 것으로 할 때,
* 사용자측이 가위, 바위, 보를 냈을 때
* 승패를 결정하는 프로그램을 작성하시오
*/
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가위바위보 게임입니다, 1.가위, 2.바위, 3.보");
		
		int dice = ran.nextInt(3)+1;
		System.out.println(String.format("랜덤으로 나온 값 %d", dice));
		
		int ans = scan.nextInt();
		
		switch (dice) {
		case 1 : switch (ans) {
		case 1 : System.out.println("비겼습니다."); break;
		case 2 : System.out.println("이겼습니다."); break;
		case 3 : System.out.println("졌습니다."); break;
		} break;
		case 2 : switch (ans) {
		case 1 : System.out.println("졌습니다."); break;
		case 2 : System.out.println("비겼습니다."); break;
		case 3 : System.out.println("이겼습니다."); break;
		} break;
		case 3 : switch (ans) {
		case 1 : System.out.println("이겼습니다."); break;
		case 2 : System.out.println("졌습니다."); break;
		case 3 : System.out.println("비겼습니다."); break;
		} break;
		}
		}
		
		}
