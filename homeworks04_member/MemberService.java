package homeworks04_member;

public class MemberService {
	
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
	public String getTax(Member member) {
		String result = "";
		int salary = member.getSalary();
		String name = member.getName();
		double taxrate = 9.7;
		double tax = salary*taxrate/100;
		
		result = "연봉" +salary + "만원을 받으시는" + name + "님의 세금은" +tax + "만원 입니다.";
		
		return result;
	}
}
