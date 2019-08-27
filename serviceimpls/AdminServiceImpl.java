package com.bitcamp.serviceimpls;

import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.AdminService;

public class AdminServiceImpl implements AdminService{
		private MemberBean[] members;
		private int count;
		
		
		public AdminServiceImpl() {
			members = new MemberBean[10];
			count = 0;
		}
		
	@Override
	public String list() {String msg = "";
	for(int i=0;i<count;i++) {
		msg += members[i].toString()+", \n";
	}
	return msg;
		
	}

	@Override
	public MemberBean findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean[] findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
