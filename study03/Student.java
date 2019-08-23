package study03;

import java.util.Scanner;

public class Student {
Scanner scan = new Scanner(System.in);
	//  static없으면 객체지향, 있으면 절차지향
	//1. BMI 2. Ranking 3. 4.
	public	String getBmi(String name, int weight, float height) {

		String eval = "";
		float bmi =  weight / (height/100 * height/100);
		if(bmi > 30.0) {
			eval = "고도비만";
		}
		return "";
	}	
	public	void getRanking() {}
	public	void HowMuch() {}
	public	void getReportCard() {}
	}
