package homeworks04_grade;

import javax.swing.JOptionPane;

public class GradeController {

//국영수, 총점,평균
	public static void main(String[] args) {
		Grade grade = new Grade();
		GradeService gradeservice = new GradeService();
		while(true) {
		switch (JOptionPane.showInputDialog("0. 종료 1.점수입력 2. 점수보기 3. 총점 산출")) {
		case "0" : JOptionPane.showInputDialog("0. 종료");
				break;
		case "1" : 
		String name = JOptionPane.showInputDialog("이름 입력");
		String kor = JOptionPane.showInputDialog("국어점수 :");
		grade.setKor(Integer.parseInt(kor));
		String eng = JOptionPane.showInputDialog("영어점수 :");
		grade.setEng(Integer.parseInt(eng));
		String math = JOptionPane.showInputDialog("수학점수 :");
		grade.setMath(Integer.parseInt(math));
		break;
		case "2" : JOptionPane.showMessageDialog(null, grade.toString());
			; break;
		case "3" : 
			JOptionPane.showMessageDialog(null, gradeservice.getTotal(grade));
		}
	}
}
}