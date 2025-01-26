import java.util.*;
	
	public class Main {
	
		public static void main(String[] args) {
			// 백준의 시간복잡도 마지막 문제
			Scanner input = new Scanner(System.in);
			
			// 함수 f(n)을 나타내는 정수 a, b
			int a1 = input.nextInt(); 
			int a0 = input.nextInt();
			// 양의 정수 c
			int c = input.nextInt();
			// 양의 정수 n
			int n = input.nextInt();
			
			// * 지금 이해 못하고 있는 부분 g(n) == n이 되는 이유와 과정을 모르겠음 
			// n의 값만 범위로 입력된다!
			// a1*n+a0 <= c*n
			// 테스트 케이스 7 7 8 1
			if (a1*n+a0 <= c*n && a1 <= c) {// a1이나 a0이 음수로 입력 되어도 테스트 할 수 있는 조건을 만들어야 한다 
				System.out.println(1);
			} else {
				System.out.println(0);
			}
			
			
			
		}
	}