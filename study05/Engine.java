package study05;

import javax.swing.JOptionPane;

public class Engine {

	public static void main(String[] args) {
		Member member = null;
		Service service = new Service();
		while(true) {
			System.out.println();
			switch(JOptionPane.showInputDialog("0.종료 1. 회원가입 2. 정보보기 3. 아이디찾기 4.BMI 구하기 5. ReportCard 6. Tax")) {
			case "0" : System.out.println("종료");
			case "1" : 
			member =new Member(); //Member(클래스,필드가 바깥에 메쏘드가 안에 리얼월드 객체) member(소프트웨어 객체, 메쏘드가 바깥에 필드가 안에) =new Member();
			member.setId(JOptionPane.showInputDialog("ID를 입력해주세요."));
			member.setPass(JOptionPane.showInputDialog("비밀번호 입력 :"));
			System.out.println("비밀번호 : ");
//			member.setPass(scan.next());
			System.out.println("이름 : ");
//			member.setName(scan.next());
			System.out.println("주민번호 :");
//			member.setSsn(scan.next());
			System.out.println("키(소수점 첫째자리까지) :");
//			member.setHeight(scan.nextDouble());
			System.out.println("몸무게(소수점 첫째자리까지) : ");
//			member.setWeight(scan.nextDouble());
			System.out.println("혈액형(A) : ");
//			member.setBlood(scan.next());
			System.out.println("국어점수");
//			member.setKor(scan.nextInt());
			System.out.println("영어점수");
//			member.setEng(scan.nextInt());
			System.out.println("수학점수");
//			member.setMath(scan.nextInt());
			System.out.println("연봉을 입력해주세요");
//			member.setSalary(scan.nextInt());
			
			break;
		case "2" :
			System.out.println(member.toString()); 
			break;
//		case "3" :
//			System.out.println("이름을 입력하면 아이디 알려줌");
////			String searchName = scan.next();
//			System.out.println("아이디를 입력하면 아이디 알려줌");
////			String searchId = scan.next();
////			if(searchName.contentEquals("a") &&
////					searchId.equals("a")) {
//				System.out.printf("찾는 아이디 : %s |n"
//						+ "주민번호 : %s |n", member.getId());
//			}
//			else
//			{System.out.println("찾는 아이디가 없습니다.");}   
//			break;
		case "4" :
			System.out.println("BMI 구하기");
				System.out.println(service.getBmi(member));
			break;
		case "5" :
			System.out.println("ReportCard");
			System.out.println(service.getReportCard(member));
			break;
		case "6" :
			System.out.println("세금계산기");
			System.out.println(service.getTax(member));
			}
		}
	}

}
