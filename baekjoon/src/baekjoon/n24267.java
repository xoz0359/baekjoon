package baekjoon;
	
	import java.util.*;
	
	public class n24267 {
	
		public static void main(String[] args) {
			// 백준의 시간복잡도 6번 문제
			Scanner input = new Scanner(System.in);
			long a = input.nextInt(); 
			// 반복문의 제어변수가 어떤 상호작용을 하든 종결적으로 시행 횟수는 입력값에 지배를 받으므로
			// 시간복잡도는 Opow(n, 3)
			// 등차수열과 공식에 대해 알아왔다
			// 1부터 n까지의 공식 x = n*(n+1)/2
			// 1-5, 1-4, 1-4
			// (5+4+3+2+1)+(4+3+2+1)+(3+2+1)+(2+1)+(1) 20
			//  (3+2+1)+(2+1)+(1) 
			// 등차수열의 합을 인덱스화 시켰을 때 다음 등차수열은 0 번째 수열과 -1 번째 수열의 합으로 이루어진다
			// 이 말은 등차수열로 시행횟수가 제어되는 함수는 가장 상위 for문의 시행횟수로 중첩 반복문의 시행 횟수에 접근할 수 있음을 의미한다!
			//  (2+1) + (1) 4
			//  (1) 1
			// ** 추가 주석
			// 정답에 가까운 공식은 (n-2)(n-1)/6 이었다 
			// 등차수열을 다루는 공식에 대해 좀 더 심화적으로 복습하고 이론을 다지고 넘어가자!
			Long ans = (long) 0, j = (long) 0;
			int cnt = 0;
			
			for (j = (a-1); j >= 1; j--) {
				for (int i = (int) (j-2); i >= 1; i--) {
					ans += i*(i+1)/2;
				}
			}
			
			
			
			System.out.println(ans);
			System.out.println(3);
			
		}
	}