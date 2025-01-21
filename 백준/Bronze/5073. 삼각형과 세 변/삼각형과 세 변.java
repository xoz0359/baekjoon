import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 삼각형의 세 각을 입력받아 삼각형의 종류를 출력하는 프로그램
		// 정삼각형 - Equilateral
		// 직삼각형 - Isosceles
		// 삼각형 - Scalene
		// 나머지 - error
		Scanner input = new Scanner(System.in);

		int a = 0, b = 0, c = -1;

		while (true) {
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
			if (a+b+c==0) {
				return;
			}
			char cnt = 'a';
			int max = a;
			if (max < b) {
				max = b;
				cnt = 'b';
			}
			if (max < c) {
				max = c;
				cnt = 'c';
			}

			boolean m = true;
			switch (cnt) {
			case 'a':
				if (a >= b + c) {
					System.out.println("Invalid");
					continue;
				}
				break;
			case 'b':
				if (b >= a + c) {
					System.out.println("Invalid");
					continue;
				}
				break;
			case 'c':
				if (c >= b + a) {
					System.out.println("Invalid");
					continue;
				}
				break;
			}

			if (a == b && a == c && b == c) {
				System.out.println("Equilateral");
			} else if (a == b || a == c || b == c) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}
		}

	}
}