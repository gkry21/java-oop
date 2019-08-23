package study05;

public class Member {
	private String name, id, pass, ssn,blood;  // 접근할 수 없음 , 보안이 매애애애애애우 좋음, 금융권에서 자바만 씀
	private double height, weight;  // private 설정 후  세터와 게터를 하면 은닉화 하였다.
	private int kor, eng, math, salary;

	public void setName(String name) {
		this.name = name;  
	}
	public String getName() {
		return this.name;  // this --> 필드(땅,멤버) --> 동급인 멤버들, 우리 멤버 
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
	public void setSsn(String ssn) {  //seter 세터 쓰기
		this.ssn = ssn;
	}
	public String getSsn() { //geter 게터 읽기   --- 읽을수만 있어 보안이 좋다한다. 
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
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return this.kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return this.eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return this.math;
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
				+ "주민번호 : %s \n "
				+ "형액형 : %s \n"
				+ "키 : %.1f \n"
				+ "몸무게 : %.1f \n"
				+ "국어점수 : %d \n"
				+ "영어점수 : %d \n"
				+ "수학점수 : %d \n"
				+ "연봉 : %d \n", name, id, pass, ssn,blood,height, weight,kor,eng,math,salary);
	}
}

