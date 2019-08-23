package com.bitcamp.controllers;

import javax.swing.JOptionPane;

import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberService; //서비스는 하나 아 멤버빈2개이상의 데이터를 가지니까 서버

public class MemberController {
//정보입력, 정보확인, bmi, 연봉계산기
	public static void main(String[] args) {
		MemberBean member = null; //초기화, 공간만 있어서 선언(실체가 없어도 됨) -> 추상
	//	-> 멤버가 하나니까 스칼라구나
		MemberService service = new MemberService(); // 선언 초기화 생성을 한꺼번에 함 --> 생성했다 (과정을 생략하고 한번에 처리한것을 생성했다고 한다.)
	// 클래스 				인스턴스											-> 
		MemberBean[] members = new MemberBean[2];
		String[] arr = null;
		String temp = "";
	//	멤버빈에 배열이 생기니까 벡터화되는구나 
		while (true) {
			switch (JOptionPane.showInputDialog("0. 종료 \n "
					+ "1.회원가입 \n"
					+ "2.마이페이지 \n "
					+ "3.비밀번호 수정 \n "
					+ "4.회원 탈퇴 \n"
					+ "5.회원목록\n"
					+ "6.아이디검색")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				break;
			case "1": 
				String spec = JOptionPane.showInputDialog("이름, 아이디,비번,주민번호,혈액형,키,몸무게");
				System.out.println("*****"+spec);
				arr = spec.split(",");
				member = new MemberBean();// 인스턴스 생성, 메모리를 만드는 키워드 진짜 공간을 가짐, 실체화됨, -> 객체생성
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPw(arr[2]);
				member.setSsn(arr[3]);
				member.setBlood(arr[4]);
				member.setHeight(Double.parseDouble(arr[5]));
				member.setWeight(Double.parseDouble(arr[6]));
				
				JOptionPane.showMessageDialog(null, service.join(member));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.getMyPage(member));
				break;
			case "3":
				temp = JOptionPane.showInputDialog("아이디, 현재비번, 변경할 비번");
				arr = temp.split(",");
				member = new MemberBean();
				member.setId(arr[0]);
				member.setPw(arr[1]+","+arr[2]);
				JOptionPane.showMessageDialog(null, service.changePassword(member));
//				String login = JOptionPane.showInputDialog("id,pw 입력");
//				String[] logins = login.split(",");
//				String passId = logins[0];
//				String passPw = logins[1];
//				String pw = JOptionPane.showInputDialog("옛날 비번, 현재 비번 입력");
//				String[] pws = pw.split(",");
//				passPw = logins[0];
//				String passNpw = logins[1];
//				member = new MemberBean();
//				member.setId(passId);
//				member.setPw(passPw);
//				member.setNpw(passNpw);
				break;
			case "4":
				JOptionPane.showMessageDialog(null, "종료");
				break;
			case "5" :
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case "6" :
				String searchId = JOptionPane.showInputDialog("검색 ID");
				member = service.findById(searchId);
				JOptionPane.showMessageDialog(null, member);
			case "7" :
				String loginvalue = JOptionPane.showInputDialog("로그인 id,pw");
				String[] loginvalues = loginvalue.split(",");
				String loginId = loginvalues[0];
				String loginPw = loginvalues[1];
				member = new MemberBean();
				member.setId(loginId);
				member.setPw(loginPw);
				String msg = service.login(member);
				JOptionPane.showMessageDialog(null, msg);
				break;
			default:
				break;
			}
		}
	}

}
