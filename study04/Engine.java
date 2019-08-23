package study04;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			//int flag = 0;
			System.out.println("0.종료 1. BMI 2.이해못할 문제");
			//flag = scan.nextInt(); 
			Student student = new Student();
			switch(scan.nextInt()) {
			case 0 : System.out.println("종료"); return;
			case 1 : System.out.println("BMI");
			String name = scan.next();
			double height = scan.nextDouble();
			double weight = scan.nextDouble();
			String result = student.getBmi(name, height, weight);
			System.out.println(result);
			
			break;
			case 2 : System.out.println("신용대출");
				System.out.println("이름을 입력해주세요");
				String name1 = scan.next();
				System.out.println("주소를 입력해주세요");
				String address = scan.next();
				System.out.println("나이를 입력해주세요");
				int age = scan.nextInt();
				System.out.println("은행잔고를 입력해주세요");
				int bank = scan.nextInt();
				System.out.println("신용도를 입력해주세요");
				String shin = scan.next();
				result = student.getMoney( name1,address,age,bank, shin);
				System.out.println(result);
				break;
			}
		}
	}

}
