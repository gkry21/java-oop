package com.bitcamp.services;
/*
 * 요구사항 (기능정의) 
 * 1. 회원가입
 * 2. 마이페이지 회원정보 확인
 * 3. 비번 수정 기능
 * 4. 회원탈퇴
 * ******************
 * <관리자기능>
 * 5. 회원목록
 * 6. 아이디검색
 */
import com.bitcamp.domains.MemberBean;
public class MemberService {  //서버!!!
	private MemberBean[] members;
	private int count;
	/**  멤버빈의 벡터화된 데이터를 저장하는 공간,멤버의 정보를 여러개 가지고 있음, 멤버 빈을 두번 돌리게 되면 벡터화 되면서 배열이 다시 스칼라로 묶고 
	 * 1. 회원가입
	 */
	
	public MemberService() {
		members = new MemberBean[2];
		count = 0;
	}
	public String join(MemberBean param) {
		
		String msg = "회원가입 성공";
		members[count] =param;
		count++;
		return msg;
	} 
	/**
	 * 2. 마이페이지
	 */
	public String getMyPage(MemberBean param) {
		return param.toString();	
	}
	/**
	 * 3. 비번 수정 
	 */
	public String changePassworld(MemberBean param) {
		String msg = "비밀번호가 변경되었습니다.";
		return msg;
	}
/**
 * 4. 회원탈퇴
 */
	public String whithDrawl(MemberBean param) {
		String msg = "회원탈퇴 완료.";
		return msg;
	}
	/*
	 * 5. 회원목록
	 */
	public String list() {
		
		String msg = "";
		for(int i=0;i<count;i++) {
			msg += members[i].toString()+", \n";
		}
		return msg;
	} 
	/*
	 *  6. 아이디검색
	 */
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for(int i=0;i<count;i++){
			if(id.equals(members[i].getId())) {
				member = members[i];
			}
			
		}
		return member;
	}
}

