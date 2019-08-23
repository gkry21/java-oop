package homeworks03;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import homeworks03.Student;
public class Engine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		while(true) {
			System.out.println("0. 종료 1. AC 2. BMI 3.HowMuch  4.Join  5. LeapYear 6. MonthEndDay 7. PassOrFail 8. Ranking 9.ReportCard 10.ScoreCalc 11. Tax 12. TimeCalc ");
			switch(scan.nextInt()) {
		case 0 : System.out.println("종료"); return;
		case 1 : 
			System.out.println("연산자를 선택하세요.1. + |n 2. - |n  3. / |n 4. *");
			int op = scan.nextInt();
			System.out.println("값을 입력해주세요");
			System.out.println("첫번째 값");
			int first  = scan.nextInt();
			System.out.println("두번째 값");
			int sec = scan.nextInt();
			
			String result = student.getAC(op,first,sec);
			System.out.println(result);
			break;
		case 2 : 
			System.out.println("BMI");  
			System.out.println("BMI  지수 측정");
			System.out.println("이름");
			String name2 = scan.next(); 
			System.out.println("몸무게");
			int weight2 = scan.nextInt();
			System.out.println("키");
			float height2 = scan.nextInt();
			String result2 = student.getBmi(name2,weight2, height2 );
			System.out.println(result2);
			break; 
//		case 3 :  break;
		case 4 : 
			System.out.println("회원가입해주세요.");
			System.out.println("아이디 :");
			String id = scan.next();
			System.out.println("비밀번호 : ");
			String pass = scan.next();
			System.out.println("이름 : ");
			String name4 = scan.next();
			System.out.println("생년월일(예) 1980-01-01 :");
			String bd = scan.next();
			System.out.println("성인여부(성인true,미성년false) :  ");
			String grow = scan.next();
			System.out.println("키(소수점 첫째자리까지) :");
			Float height4 = scan.nextFloat();
			System.out.println("몸무게(소수점 첫째자리까지) : ");
			Float weight4 = scan.nextFloat();
			System.out.println("혈액형(A) : ");
			String blood = scan.next();
			String result4 = student.getJoin(id,pass,name4,bd,grow,height4,weight4,blood);
			System.out.println(result4);
			break;
		case 5 : 
			System.out.println("윤년 계산기");
			System.out.println("궁금한 연도를 입력해주세요");
			int year = scan.nextInt();
			String result5 = student.getLeap(year);
			System.out.println(result5);
			break;
		case 6 : 
			System.out.println("궁금한 월을 입력해주세요");
			int month = scan.nextInt();
			
			String result6 = student.getMonthEndDay(month);
			System.out.println(result6);
			break;
//		case 7 :  break;
//		case 8 :  
//		
//			break;
		case 9 :  
			System.out.println("학생이름과 국어, 영어, 수학 점수를 차례대로 입력해주세요");
			String name9 = scan.next();
			int kor = scan.nextInt(), math =scan.nextInt() , eng = scan.nextInt();
			
			String result9 = student.getReportCard(name9,kor,math,eng);
			break;
		case 10 :  
			while(true) { 
				System.out.println("점수 계산기, 더하시려는 숫자를 입력하세요(종료는 -1)");
				int num = scan.nextInt();
				int sum = 0, cnt=0,avg=0;
				if(num== -1) {
				
					String result10 = student.getScoreCalc(num,sum,cnt,avg);
					System.out.println(result10);
					break;
				}
				
			}
			break;
		case 11 : 
			System.out.println("세금 계산기");
			System.out.println("이름을 입력해주세요");
			String name11 = scan.next();
			System.out.println("연봉을 입력해주세요");
			int pay = scan.nextInt();
			String result11 = student.getTax(name11, pay);
			System.out.println(result11);
			break;
		case 12 : 
			System.out.println("시간 계산기");
			System.out.println("초를 입력해주세요");
			int sec12 = scan.nextInt();
			int ss12 = 0, mm12=0,hh12=0;
			String result12 = student.getTimeCalc(sec12, ss12,mm12,hh12);
			System.out.println(result12);
			
			break;
			
		}
	}
	}

}
