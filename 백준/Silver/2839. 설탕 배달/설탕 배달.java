import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		// 필요한 최소의 설탕포대를 구하는 프로그램
		// 절대 브루트포스를 기억해..
		int k5 = n / 5;
		int k3 = n / 3;
		if (n % 5 == 0) {
			System.out.println(k5);
			return;
		}

		int fi = 5, th = 3, cnt = 0, res = -1;

		while (k5 > 0) {
			int n2 = n - fi * k5;
			if (n2 % 3 == 0) {
				System.out.println(k5 + n2 / 3);
				return;
			}
            k5--;
		}
		if (n % 3 == 0) {
			System.out.println(k3);
			return;
		}
		

		System.out.println(res);

	}
}