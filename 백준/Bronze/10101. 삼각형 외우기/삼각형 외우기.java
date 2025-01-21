import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 삼각형의 세 각을 입력받아 삼각형의 종류를 출력하는 프로그램
		// 정삼각형 - Equilateral
		// 직삼각형 - Isosceles
		// 삼각형 - Scalene
		// 나머지 - error
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int	b = input.nextInt();
		int c = input.nextInt();
		
		if (a+b+c!=180) {
			System.out.println("Error");
			return;
		}
		if (a==b && a==c && b==c) {
			System.out.println("Equilateral");
		}else if(a==b || a==c || b==c) {
			System.out.println("Isosceles");
		}else {
			System.out.println("Scalene");
		}
		
	}
}