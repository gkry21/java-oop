package study02;

public class Sum1to10 {

	public static void main(String[] args) {
		String eval ="";
		int sum = 0;
		for(int i=1;i<=10;i++) {
		if(i==10) {
			eval += i+" = ";
			sum += i;
		}
			else if(i!=10) {
				eval += i+" + ";
				sum += i;
			}
			}
		System.out.println(eval + sum);
			}
}