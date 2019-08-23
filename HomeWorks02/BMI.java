
/*

 
/*
 *  To. 개발자님
사람의 이름을 입력하고, 몸무게 , 키를 입력하면
해당 사람의 상태가 비만인지 저체중인지 알려주는 BMI 지수 측정하는 프로그램을 만들어 주세요.
BMI 구하는 공식은 아래와 같아요. 더 궁금하면 여기를 클릭하세요.
       BMI = x KG / (y M * y M)
 
Example for 175 cm height and 70 kg weight:
BMI = 70 / (1.75 * 1.75) = 22.86
 
(bmi > 30.0) 고도비만
(bmi > 25.0) 비만
(bmi > 23.0) 과체중
(bmi > 18.5) 정상
저체중
       이랍니다.
 
 */

package homeworks02;
import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("BMI");  
		System.out.println("BMI  지수 측정");
		System.out.println("이름");
		String name = scan.next();
		System.out.println("몸무게");
		int weight = scan.nextInt();
		System.out.println("키");
		float height = scan.nextInt();
		float bmi = weight / (height /100 * height/100);
		String eval = "";		
		System.out.println();
		if (bmi>30.0) {
			eval = "고도비만";
		} else if (bmi>25.0) {
			eval = "비만";
		} else if (bmi>23.0) {
			eval = "과체중";
		} else if (bmi>18.5){
			eval = "정상";
		} else if(bmi<18.5){
			eval = "저체중";
		}

		else {System.out.println("시스템 오류");}
		System.out.printf("%s님은 %s입니다.", name,eval);
	}
}