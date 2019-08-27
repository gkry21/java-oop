package com.bitcamp.controllers;

import javax.swing.JOptionPane;
import com.bitcamp.domains.PhoneBean;
import com.bitcamp.services.PhoneService;

public class PhoneContoller {
//	
//		
//	public static void main(String[] args) {
//		/*
//		 * 사용하는 전화기는 4개, 집, 투지, 아이폰, 안드로이드 선택 4개
//		 */
//		PhoneService svc = new PhoneService();
//		PhoneBean phone = new PhoneBean();
//		
//	while(true) {
//		switch(JOptionPane.showInputDialog("0. 종료 1. 집전화기 2. 셀폰 3. 아이폰 4. 안드로이드")) {
//		case "0" : return;
//		case "1" : 
//			String msg = JOptionPane.showInputDialog(null, "생산자,통화 내용,수신자");
//			String[] arr = msg.split(",");
//			phone.setCompany(arr[0]);
//			phone.setCall(arr[1]);
//			phone.setReceiver(arr[2]);
//			JOptionPane.showMessageDialog(null, svc.callwithPhone(phone));
//		break;
//		case "2": 
//			String msg = JOptionPane.showInputDialog(null, "생산자,수신자, 통화내용");
//			String msg = JOptionPane.showInputDialog(null, "생산자,통화 내용,수신자");
//			String[] arr = msg.split(",");
//			phone.setCompany(arr[0]);
//			phone.setCall(arr[1]);
//			phone.setReceiver(arr[2]);
//			JOptionPane.showMessageDialog(null, svc.callwithPhone(phone));
//			
//		default : break;
//		}
//	}	
//	}

}
