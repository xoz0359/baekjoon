import java.util.*;
	
	public class Main {
	
		public static void main(String[] args) {
			// 백준의 시간복잡도 3번 문제
			// 함수 안에 parameter n을 제어변수로 사용하는 중첩 반복문이 있음으로
			// 이 코드의 실행 횟수는 pow(n, 2)번이고 최대 차항은 2이다
			// 하지만 직접 실행하면서 채점하므로 long 형을 사용해야 한다
			// 우변 a*a 이 int 형에 먼저 계산된 후 b에 대입되므로 입력값을 받는 변수도 long형을 사용해야 한다
			Scanner input = new Scanner(System.in);
			long a = input.nextLong(); 
			System.out.println(a*a);
			System.out.println(2);	
		}
	}