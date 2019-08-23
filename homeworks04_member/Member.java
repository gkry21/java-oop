package homeworks04_member;

public class Member {//jop로 바꿔
	private String name, id, pass, ssn,blood;  
	private double height, weight;  
	private int  salary;

	public void setName(String name) {
		this.name = name;  
	}
	public String getName() {
		return this.name;  
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass() {
		return this.pass;
	}
	public void setSsn(String ssn) {  
		this.ssn = ssn;
	}
	public String getSsn() {  
		return this.ssn;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getBlood() {
		return this.blood;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return this.weight;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return this.salary;
	}
	@Override
	public String toString() {
		return String.format("회원정보: |n"
				+ "이름 : %s \n"
				+ "아이디 : %s \n"
				+ "비번 : %s \n"
				+ "형액형 : %s \n"
				+ "키 : %.1f \n"
				+ "몸무게 : %.1f \n"
				+ "연봉 : %d \n", name, id, pass,blood,height, weight, salary);
	}
}

