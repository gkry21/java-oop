package study02;
import java.util.Scanner;
public class OddSequence {
       public static void main(String[] args) {
              Scanner scan = new Scanner(System.in);
              // 예제 사용자가 지정한 수 중 홀수를 지정, + 홀수,짝수도 사용자가 지정
              // 1 + 3 + 5 + 7 + 9 =
              // i % 2 = 0 이면 짝수 1이면 홀수
              System.out.println("");
              String ans = scan.next();
              String sequence = "";
              int series = 0;
              for(int i=1;i<=10;i++) {
                     if(i % 2 != 1) {
                     if(i != 10) {
                           sequence += i + "+";
                     } else {
                           sequence += i + "=";
                     }
                     series += i;
              }
       }
              System.out.println(sequence + series);
}
}