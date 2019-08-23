/*
 * To. 개발자님
저희는 비트올림픽 위원회입니다.
한번의 트랙에서 육상선수는 총 3명 입니다.
총 세명의 100m 기록을 입력받아서 
1, 2, 3 등을 가려야 합니다.
 
A 선수 기록 : 10.5초
B 선수 기록 : 10.8초
C 선수 기록 : 10.1초 
라고 입력받았다면
 
###### 성적 랭킹 #######
 
1등 : C 선수 기록 (10.1초)
2등 : A 선수 기록 (10.5초)
3등 : B 선수 기록 (10.8초)
 
라고 출력시켜주세요.
 
 */

package homeworks02;
import java.util.Scanner;

public class Ranking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("기록을 입력해주세요");
		System.out.println("A선수");
		float a = scan.nextInt();
		System.out.println("B선수");
		float b = scan.nextInt();
		System.out.println("C선수");
		float c = scan.nextInt();
		float[] rank = {a, b, c};

		for(int i  = 0; i < rank.length  ; i++ ){
			int tmp = i; 
			float value = rank[i]; 

			for(int j = i+1; j < rank.length; j++) {
				if(rank[tmp] > rank[j] ) {
					float value2 = rank[j]; 
					rank[tmp] = value2;
					rank[j] = value;      
				}
			}
		}

		for(int i  =0; i < rank.length  ; i++ ){
			System.out.println(i+1+"등:" + rank[i]);
		}
	}

}