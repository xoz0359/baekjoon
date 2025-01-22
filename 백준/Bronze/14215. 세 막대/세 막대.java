import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 세 직선을 입력 받아 가장 큰 삼각형을 만드는 프로그램
		// 짧은 선분 두 개의 길이의 합이 긴 선분보다 길어질 때마다 삼각형의 전체 둘레는 반비례하며 증가한다
		
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if (a==b && a==c && b==c) {
			System.out.println(a*3);
			return;
		}
		
		char mac = 'a'; // ㄴㄴ 맞네 지금 이상함
		int max = a;
		if (max < b) {
			max = b;
			mac = 'b';
		}
		if (max < c) {
			max = c;
			mac = 'c';
		}
		int mins = 0;
		switch (mac) {
		case 'a':
			mins = b+c;
			break;
		case 'b': 
			mins = a+c;
			break;
		default:
			mins = a+b;
		}
		
		if (max >= mins) { 
			System.out.println(mins+mins-1);
		}else {
			System.out.println(mins+max);
		}
	}
}