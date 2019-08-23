package study05;

public class Service { // 필드의 의미는 2개, 땅을 의미하는 필드와, 멤버변수를 의미하는 필드. 
	
	public String getBmi(Member member) {
		String result = "";
		String eval = "";
		String name = member.getName();
		double height = member.getHeight();
		double weight = member.getWeight();
		double bmi = weight / (height/100 * height/100);
		
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
		result =name + "님은" + eval +"입니다.";
		return result;	 
	}
	
	public String getReportCard(Member member) {
		String result = "";
		String name = member.getName();
		int kor = member.getKor();
		int eng = member.getEng();
		int math = member.getMath();
		int sum = kor + eng + math;
		int avg = sum/3;
		if(avg>=90){
			
			System.out.println("학생           국어        영어        수학        총점        평균        합격여부");
			System.out.println(" =======================================================");
			System.out.println(name    +    kor     +  math    + eng       + sum     + avg        + "(장학생)");
		} else if(avg>=70){
			System.out.println("학생           국어        영어        수학        총점        평균        합격여부");
			System.out.println(" =======================================================");
			System.out.println(name    +    kor     +  math    + eng       + sum     + avg        + "(합격)");
		}
		else if(avg<=69) {
			System.out.println("학생           국어        영어        수학        총점        평균        합격여부");
			System.out.println(" =======================================================");
			System.out.println(name    +     kor     +  math    + eng       + sum     + avg        + "(불합격)");
		}
		return result;
	}
	public String getTax(Member member) {
		String result = "";
		String name = member.getName();
		int salary = member.getSalary();
		double taxrate = 9.7;
		double tax = salary*taxrate/100;
		result = "연봉이" +salary + "이신" + name + "님의 세금은" + tax +"입니다."; 
		return result;
	}
}
