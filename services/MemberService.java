package com.bitcamp.services;
import com.bitcamp.domains.MemberBean;

public interface MemberService { 
	public String join(MemberBean param);
	public String getMyPage(MemberBean param);
	public String changePassword(MemberBean param);
	public String withDrawl(MemberBean param);
	public String existId(String id);
	public String login(MemberBean param);
}