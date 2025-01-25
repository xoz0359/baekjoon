import java.util.*;
	
	public class Main {
	
		public static void main(String[] args) {
			// 백준의 시간복잡도 6번 문제
			Scanner input = new Scanner(System.in);
			long a = input.nextInt(); 
			// 반복문의 제어변수가 어떤 상호작용을 하든 종결적으로 시행 횟수는 입력값에 지배를 받으므로
			// 시간복잡도는 Opow(n, 3)
			// 등차수열과 공식에 대해 알아왔다
			// 1부터 n까지의 공식 x = n*(n+1)/2
			// 1-5, 1-4, 1-4
			// (4+3+2+1)+(3+2+1)+(2+1)+(1) 20
			//  (3+2+1)+(2+1)+(1) 
			// 등차수열의 합을 인덱스화 시켰을 때 다음 등차수열은 그 전 등차수열의 합으로 이루어진다
			// 이 말은 등차수열로 시행횟수가 제어되는 함수는 단 하나의 반복문으로 중첩 반복문의 시행횟수를 계산할 수 있음을 의미한다
			//  (2+1) + (1) 4
			//  (1) 1
			Long ans = (long) 0, j = (long) 0;
			int cnt = 0;
			
			for (j = (a-2); j >= 1; j--) {
				ans += j*(j+1)/2;
			}
			
			
			
			System.out.println(ans);
			System.out.println(3);
			
		}
	}