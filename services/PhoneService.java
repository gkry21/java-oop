package com.bitcamp.services;
import com.bitcamp.domains.PhoneBean;
/*
 * 기능 정의
 * 1. 집전화기로 통화
 * 2. 2g폰 통화
 * 3. 아이폰 통화
 * 4. 안드로이드 통화
 * *  나는  {금성}에서 만든 {집전화기}를 사용해서 {길동}에게 {안녕}이라고 통화했다.   ---> toString
 */
public interface  PhoneService {
		public String callwithPhone(PhoneBean param); 
		public String getCompany();
}
