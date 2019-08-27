package com.bitcamp.domains;
/*
 *  생산자명 company
 *  통화내용 call
 *  통화대상 : receiver
 *  문자 : text
 *  검색 : search
 *  
 *  전화기형태 KIND -> 상수: 아이폰
 *  나는  {애플}에서 만든 {아이폰}를 사용해서 {뉴스}라고 검색 후 {길동}에게 문자를 보냈다.   ---> toString
 */
public class IPhoneBean extends CelPhoneBean {
	public final static String KIND = "아이폰";
	private String search;
	
	public void setSearch(String search) {
			this.search = search;
	}
	public String getSearch() {
		return search;
	}
	@Override
		public String toString() {
		
			return String.format("나는 %s에서 만든 %s를 사용해서 %s라고 검색 후 %s에게 %s를 보냈다"
											,getCompany(),KIND,search,getReceiver(),getText());
		}
	
}
