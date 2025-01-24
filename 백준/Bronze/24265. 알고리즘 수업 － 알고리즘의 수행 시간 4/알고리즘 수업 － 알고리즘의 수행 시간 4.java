	import java.util.*;
	
	public class Main {
	
		public static void main(String[] args) {
			// 백준의 시간복잡도 4번 문제
			
			Scanner input = new Scanner(System.in);
			long a = input.nextInt(); 
			// ㅋㅋ 나는 수학은 못하지만 코딩은 칠줄 알지
			long sum = 0;
			for (int i = 1; i < a; i++) {
				sum+=i;
			}
			System.out.println(sum);
			System.out.println(2);
			
		}
	}