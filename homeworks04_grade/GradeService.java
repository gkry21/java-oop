package homeworks04_grade;

public class GradeService {
		
		public String getTotal(Grade grade) {
		String result = "";
		String name = grade.getName();
		int kor = grade.getKor();
		int eng = grade.getEng();
		int math = grade.getMath();
		int sum = kor+eng+math;
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
	}