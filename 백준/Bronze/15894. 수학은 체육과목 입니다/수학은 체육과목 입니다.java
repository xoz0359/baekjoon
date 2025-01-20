import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 피라미드의 둘레 길이를 구하는 프로그램
		// 
		Scanner input = new Scanner(System.in);
		
		long a = input.nextLong();
		if (a==1) {
			System.out.println(4);
			return;
		}
		System.out.println(a*4);
		
		
	}
}