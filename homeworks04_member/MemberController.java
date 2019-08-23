package homeworks04_member;

import javax.swing.JOptionPane;

public class MemberController {
 //조인 정보보기,bmi,tax
	public static void main(String[] args) {
		Member member = null;
		MemberService memberservice = new MemberService();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1. 회원가입 2. 정보보기 3.BMI 구하기 4. Tax")) {
			case "0" : System.out.println("종료");
			case "1" : 
			member =new Member(); //Member(클래스,필드가 바깥에 메쏘드가 안에 리얼월드 객체) member(소프트웨어 객체, 메쏘드가 바깥에 필드가 안에) =new Member();
			member.setId(JOptionPane.showInputDialog("ID를 입력해주세요."));
			member.setPass(JOptionPane.showInputDialog("비밀번호 입력 :"));
			member.setName(JOptionPane.showInputDialog("이름 : "));
			String height = JOptionPane.showInputDialog("키(소수점 첫째자리까지) : ");
			member.setHeight(Double.parseDouble(height));
			String weight = JOptionPane.showInputDialog("몸무게(소수점 첫째자리까지) : ");
			member.setWeight(Double.parseDouble(weight));
			member.setBlood(JOptionPane.showInputDialog("혈액형(A) :"));
			String salary = JOptionPane.showInputDialog("연봉입력 :");
			member.setSalary(Integer.parseInt(salary));
			break;
		case "2" :
			JOptionPane.showMessageDialog(null,member.toString());
			break;
		case "3" :
	
			JOptionPane.showMessageDialog(null, memberservice.getBmi(member));
			break;
		case "4" :
			JOptionPane.showMessageDialog(null, memberservice.getTax(member));
		break;
			}
		}
	}

}
