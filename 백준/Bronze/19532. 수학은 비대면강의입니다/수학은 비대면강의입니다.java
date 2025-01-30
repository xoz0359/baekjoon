import java.util.*;

public class Main {

	public static void main(String[] args) {
		// ax + by = c, dx + ey = f 인 연립방정식에서 정수 a~f가 주어졌을 때 x, y를 구하는 프로그램
		// 연립방정식 풀이와 반복문을 사용한 풀이 둘 다 구현해보기
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		
		
		// 반복문을 활용한 풀이
		for (int i=-999; i<1000; i++) {
			for (int j =-999; j<1000; j++) {
				if(a*i + b*j == c && d*i + e*j == f) {
					System.out.print(i+" "+j);
				}
			}
		}
		
		
	}
}