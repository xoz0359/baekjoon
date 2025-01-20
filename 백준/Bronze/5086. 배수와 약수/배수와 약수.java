import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 두 수가 주어졌을 때 두 수의 상관관계를 나타내는 프로그램
		// 입력 횟수가 정해지지 않아서 0, 0이 입력 되면 프로그램을 종료한다 (조건에 의한 반복문 사용)
		Scanner input = new Scanner(System.in);

		while (true) {
			int a = input.nextInt();
			int b = input.nextInt();
			if (a == 0 && b == 0) {
				input.close();
				return;
			}else if (a/b > 1) {
				if (a%b == 0) {
					System.out.println("multiple");
				} else {
					System.out.println("neither");
				}
			}else {
				if (b%a == 0) {
					System.out.println("factor");
				} else {
					System.out.println("neither");
				}
			}
		}
		
		
	}
}