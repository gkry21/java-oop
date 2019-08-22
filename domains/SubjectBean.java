package com.bitcamp.domains;

public class SubjectBean {
	private String name;
	private int kor,eng,math;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setKor(int kor) {
		kor = kor;
	}
	public int getKor() {
		return kor;
	}
	public void serEng(int eng) {
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
	public String toStirng() {
		return String.format("국어 : %d \n"
				+ "영어 : %d \n"
				+ "수학 : %d \n",kor,eng,math);
	}
}
