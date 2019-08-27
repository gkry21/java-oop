package com.bitcamp.serviceimpls;

import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberService;

public class MemberServiceImpl  implements MemberService{
	private MemberBean[] members;
	private int count;
	
	public MemberServiceImpl() {
		members = new MemberBean[10];
		count = 0;
	}
	
	@Override
	public String join(MemberBean param) {
		String msg = "회원가입 성공";
		members[count] =param;
		count++;
		return msg;
	}
	@Override
	public String getMyPage(MemberBean param) {
			return param.toString();	
	}
	@Override
	public String changePassword(MemberBean param) {
		String msg = "비밀번호가 변경되었습니다.";
		String id = param.getId();
		String pw = param.getPw();
		String[] pws = pw.split(",");
		String oldPw = pws[0];
		String newPw = pws[1];
		for(int i =0; i< count;i++) {
			if(param.getId().equals(members[i].getId()) 
					&& param.getPw().equals(members[i].getPw()) ) {
				members[i].setPw(newPw);
			}
	}
		return msg;
	}
	
	@Override
	public String withDrawl(MemberBean param) {
			String msg = "회원탈퇴 완료.";
			return msg;
	}
	@Override
	
	public String existId(String id) {
		String msg = "가입가능한 아이디 입니다.";
		// 이미 존재하는 아이디
		
		MemberBean member = new MemberBean();
		
		for(int i =0;i <= count ;i++) {	
			if(id.equals(members[i].getId())) {
				msg = "이미 존재하는 아이디";
				break;
			} 
		}
		return msg;
	}
	@Override
	public String login(MemberBean param) {
			String msg = "로그인 실패";
			
			for(int i =0; i<count; i++) {
						if(param.getId().equals(members[i].getId()) && param.getPw().equals(members[i].getPw()) ) {   //이중 if 문을 써도 되지만 &&을 쓰면 좀 더 빠르다.
								msg = "로그인 되었습니다.";
										break;}
						}
			return msg;
	}
}
