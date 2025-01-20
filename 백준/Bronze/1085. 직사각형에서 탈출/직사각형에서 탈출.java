import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// 사각형의 넓이를 구하는 프로그램
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		
		//0 - a - c
		//0 - b - d
		int num1 = c-a, num2 = d-b;
		if (num1 > a) {
			num1 = a;
		}
		if (num2 > b) {
			num2 = b;
		}
		System.out.println(num1<num2 ? num1 : num2);
	}
}