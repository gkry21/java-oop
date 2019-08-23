package com.bitcamp.services;
import javax.swing.JOptionPane;

/*
 * 요구사항 (기능정의) 
 * 1. 회원가입
 * 2. 마이페이지 회원정보 확인
 * 3. 비번 수정 기능
 * 4. 회원탈퇴
 * 5.아이디 존재 체크
 * 6. 로그인
 * ******************
 * <관리자기능>
 * 1. 회원목록
 * 2. 아이디검색 
 * 3. 이름검색
 * 4. 전체회원수
 */
import com.bitcamp.domains.MemberBean;
public class MemberService {  //서버!!!
	private MemberBean[] members;
	private int count;
	/**  멤버빈의 벡터화된 데이터를 저장하는 공간,멤버의 정보를 여러개 가지고 있음, 멤버 빈을 두번 돌리게 되면 벡터화 되면서 배열이 다시 스칼라로 묶고 
	 * 1. 회원가입
	 */
/**********************************************************
 * 	사용자 기능
 **********************************************************/
	public MemberService() {
		members = new MemberBean[10];
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
	 * 3. 비번 수정(옛날 비번, 신규비번을 입력받아서 옛날 비번을 체크 후 일치하면 신규비번으로 변경 )
	 * 비번 변경후 로그인 실행해서 새로 바뀐 비번이 로그인 성공. 옛날 비번은 로그인 실패
	 */
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
//		//if(옛날 비번이 맞으면, 스플릿사용하여 비교, 맞으면 신규비번으로 오버라이딩, ))
//		//로그인
//		for(int i=0;i<count;i++)
//		if(param.getId().equals(members[i].getId()) && param.getPw().equals(members[i].getPw())) {
//			//새로운 비번으로 오버라이딩
//			if(param.getPw().equals(members[i].getPw())) {
//				
//				MemberBean setPw = new MemberBean();
//			break;}
//	
//		}
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
	 *  5. 아이디 체크
	 */
	
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
	/*
	 * 6. 로그인(파라미터로 id, pw만 입력받은 상태)
	 */
	public String login(MemberBean param) {
		String msg = "로그인 실패";
		
		for(int i =0; i<count; i++) {
					if(param.getId().equals(members[i].getId()) && param.getPw().equals(members[i].getPw()) ) {   //이중 if 문을 써도 되지만 &&을 쓰면 좀 더 빠르다.
							msg = "로그인 되었습니다.";
									break;}
					}
		return msg;
				}
/****************************************************************
 *  관리자 기능
 ****************************************************************/
	
	/*
	 * 1. 회원목록
	 */
	public String list() {
		
		String msg = "";
		for(int i=0;i<count;i++) {
			msg += members[i].toString()+", \n";
		}
		return msg;
	} 
	/*
	 *  2. 아이디검색
	 */
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for(int i=0;i<count;i++){
			if(id.equals(members[i].getId())) {
				member = members[i];
			}
			/**
			 * 3. 이름검색
			 */
		}
		return member;
	}
//	public MemberBean[] findByName(String name) {
//		
//		MemberBean[] members = new MemberBean[count];  //많이 찾을거 아니니까 쓸데 없는 공간 안만들고 카운트 넣기
//		int same = 0;
//		
//		for(int j=0;j<count;j++) {
//			if(name.equals(this.members[j].getName())) { 
//				same++;
//				break;
//		}
//			MemberBean[] members = new MemberBean[same];
//			int j = 0;
//			for(int i=0;i<count;i++) {
//				if(name.equals(this.members[i].getName())) {
//				members[j] = this.members[i];
//					j++;
//				if(members.length == j) {
//						break;
//			}
//			}
//			}
//		return members;
//		
//		}
		/**
		 * 4. 전체회원수
		 */
		public String countAll() {
			return "총회원수" + count;
			
		}
	}
// }

