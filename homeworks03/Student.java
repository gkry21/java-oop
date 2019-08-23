package homeworks03;

public class Student {
	public String getAC(int op, int first, int sec) {
		String result ="";
		int eval = 0;
		if(op==1) {
			eval = first+sec;
			result = first + "+" + sec + "=" + eval;
		}
		else if(op==2) {
			eval = first-sec;
			result = first + "-" + sec + "=" + eval;
		
		}
		else if(op==3) {
			eval = first/sec;
			int na = first%sec;
			result = first + "/" + sec + "=" + eval + "["+na+"]";
		
		}
		else if(op==4) {
			eval = first*sec;
			result = first + "*" + sec + "=" + eval;
		
		}
		
		return result;
	}
	public String getBmi(String name2,int weight2,float height2) {
		float bmi = weight2 / (height2 /100 * height2/100);
		String eval = "";		
		System.out.println();
		if (bmi>30.0) {
			eval = "고도비만";
		} else if (bmi>25.0) {
			eval = "비만";
		} else if (bmi>23.0) {
			eval = "과체중";
		} else if (bmi>18.5){
			eval = "정상";
		} else if(bmi<18.5){
			eval = "저체중";
		}

		else {System.out.println("시스템 오류");}	
		String result = name2 + "님은" + eval + "입니다";
		return result;
	}
//	public String () {}
//
	public String getJoin(String id, String pass,String name4,String bd,String grow,Float height4,Float weight4,String blood) {
	String result4 = "";
		
		System.out.println("=== 회원정보 ===");
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 :" + pass);
		System.out.println("이름 :" + name4);
		System.out.println("생년월일(예) 1980-01-01 :" + bd);
		System.out.println("성인여부(성인true,미성년false) : " + grow );
		System.out.println("키(소수점 첫째자리까지) :" + height4 +"cm");
		System.out.println("몸무게(소수점 첫째자리까지) :" + weight4 + "kg");
		System.out.println("혈액형(A) :" + blood);
		return result4; 
	}
	public String getLeap(int year) {
		String eval = "";
		if(year%4==0) {
			eval = "윤년";
			if(year%100==0) {
				eval = "평년";
				if(year%400==0) {
					eval = "윤년";
				
				}
			}
		}
		else {eval = "평년";}
		String result5 = year+"년은"+ eval +"입니다.";
		return result5;
	}
	public String getMonthEndDay(int month) {
		int eval = 0;
		switch(month) {
	case 1 : eval = 31; break;
	case 2 : eval = 29; break;
	case 3 : eval = 31; break;
	case 4 : eval = 30; break;
	case 5 : eval = 31; break;
	case 6 : eval = 30; break;
	case 7 : eval = 31; break;
	case 8 : eval = 31; break;
	case 9 : eval = 30; break;
	case 10 : eval = 31; break;
	case 11 : eval = 30; break;
	case 12 : eval = 31; break;
	}
		String result = month + "월은" + eval +"일 까지 입니다.";
		return result;
	}
////	public String () {}
////	public String () {}
////	public String () {}
	public String getReportCard(String name9, int kor, int eng, int math) {	//result 어떻게 써야함???
		int sum = kor + math + eng;
		int avg =  sum / 3;
		String result9 = "";
			if(avg>=90){
			
				System.out.println("학생           국어        영어        수학        총점        평균        합격여부");
				System.out.println(" =======================================================");
				System.out.println(name9    +    kor     +  math    + eng       + sum     + avg        + "(장학생)");
			} else if(avg>=70){
				System.out.println("학생           국어        영어        수학        총점        평균        합격여부");
				System.out.println(" =======================================================");
				System.out.println(name9    +    kor     +  math    + eng       + sum     + avg        + "(합격)");
			}
			else if(avg<=69) {
				System.out.println("학생           국어        영어        수학        총점        평균        합격여부");
				System.out.println(" =======================================================");
				System.out.println(name9    +     kor     +  math    + eng       + sum     + avg        + "(불합격)");
			}
		return result9;
	}
	public String getScoreCalc(int num, int sum, int cnt, int avg) { //모르겠음 ㅠ
		sum += num;
		avg = sum/cnt;
		String text = "";
		if(cnt==0) {
			text += String.valueOf(num);
		}
		else if(cnt!=0){
			text += "+" + String.valueOf(num);}
		cnt++;
		String result10 = "현재까지의 누적값은" + text + "=" + sum +  "이고, 평균은" + avg +  "입니다. (소수점이하는 절삭)";
		return result10;
		}
	public String getTax(String name11, int pay) {
		double taxrate = 9.7; //정책 변경시 세율 입력
		double tax = pay * taxrate / 100;
		String result11 = "연봉" + pay +  "만원을 받으시는" + name11 +"님께서 납부할 세금은" + tax + "만원입니다.";
		
		return result11;
		}
	public String getTimeCalc(int sec12,int ss12, int mm12, int hh12) {
		mm12 = sec12/60;
		ss12 = sec12 - (mm12*60);
		hh12 = mm12/60;
		mm12 = mm12 - (hh12*60);
		
		String result12 = hh12 + "시간" + mm12 + "분" + ss12 +"초 입니다.";
		return result12;
		}
	
	}
