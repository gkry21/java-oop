package com.bitcamp.controllers;

import javax.swing.JOptionPane;

public class AdminController {

	public static void main(String[] args) {
		while(true) {
			switch(JOptionPane.showInputDialog("0. 종료 \n "
					+ "1.회원가입 \n"
					+ "2.마이페이지 \n "
					+ "3.비밀번호 수정 \n "
					+ "4.회원 탈퇴 \n"
					+ "5.아이디 체크\n"
					+ "6.로그인")) {
//					case "5" :
//						JOptionPane.showMessageDialog(null, service.list());
//						break;
//					case "6" :
//						String searchId = JOptionPane.showInputDialog("검색 ID");
//						member = service.findById(searchId);
//						JOptionPane.showMessageDialog(null, member);
			}
		}
	}

}
