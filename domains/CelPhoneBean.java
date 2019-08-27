package com.bitcamp.domains;
/*
 *  생산자명 company
 *  통화내용 call
 *  통화대상 : receiver
 *  문자 : text
 *  전화기형태 KIND -> 상수: 셀룰러폰
 *  나는  {삼성}에서 만든 {셀룰러폰}를 사용해서 {길동}에게 {안녕}이라고 문자했다.   ---> toString
 */
public class CelPhoneBean extends PhoneBean {
		public final static String KIND = "셀룰러폰";
		private String text;
		
		public void setText(String text) {
			this.text = text;
		}
		public String getText() {
			return text;
		}
		@Override
			public String toString() {
				
				return String.format("나는 %s에서 만든 %s를 사용해서 %s에게 %s이라고 %s했다."
											,getCompany(),KIND,getReceiver(),getCall(),text);
			}
}
