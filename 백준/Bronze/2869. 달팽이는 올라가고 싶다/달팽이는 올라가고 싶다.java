import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 낮에 a미터 밤에 b미터 나무를 오르는 달팽이가 꼭대기에 도달하는 시점을 구하는 프로그램
		// 시간복잡도와 접촉되는 문제
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int num1 = c-b;
		int num2 = a-b;
		 	
		if (num1%num2 > 0) {
			System.out.println(num1/num2+1);
		}else {
			System.out.println(num1/num2);
		}
		
		
		
	}
}