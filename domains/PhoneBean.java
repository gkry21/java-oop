package com.bitcamp.domains;
/*
 *  생산자명 company
 *  통화내용 call
 *  통화대상 : receiver
 *  전화기형태 KIND -> 상수: 일반 전화기(집), 2G폰, 아이폰, 안드로이드폰
 *  나는  {금성}에서 만든 {집전화기}를 사용해서 {길동}에게 {안녕}이라고 통화했다.   ---> toString
 */
public class PhoneBean {
		private String company, call, receiver;
		public final static String KIND = "집전화기";    // 상수
		
		public void setCompany(String company) {
			this.company = company;
		}
		public String getCompany() {
			return company;
		}
		public void setCall(String call) {
			this.call = call;
		}
		public String getCall() {
			return call;
		}
		public void setReceiver(String reciver) {
			this.receiver = reciver;
		}
		public String getReceiver() {
			return receiver;
		}
	
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return String.format("나는 %s에서 만든 %s를 사용해서 %s에게 %s이라고 통화했다."
				,company,KIND,receiver,call);
	
}
}
