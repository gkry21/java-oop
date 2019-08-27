//인캡슐레이션, 최소한의 게터세터 

package com.bitcamp.domains;

public class MemberBean { //도메인은 클라이언트
	private String name, id, pw, ssn,blood;  
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
		return this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return this.pw = pw;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn () {
		return this.ssn = ssn;
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
	public String toString() {
		//
		return String.format("[회원정보: \n"
				+ "아이디 : %s \n"
				+ "비번 : %s \n"
				+ "이름 : %s \n"
				+ "주민번호 : %s \n"
				+ "혈액형 :%s형\n"
				+ "키 : %scm\n"
				+ "몸무게 : %skg]\n",
				name, id, pw, ssn,blood,height, weight,salary);
	}
}