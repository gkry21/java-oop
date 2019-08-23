package homeworks04_grade;

public class Grade {
	private String name;
	private int kor,eng,math;

	public  void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return this.name;
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
	public String toString() {
		return String.format("국어점수 : %d \n"
				+ "영어점수 : %d \n"
				+ "수학점수 : %d \n",kor,eng,math);
	}

}