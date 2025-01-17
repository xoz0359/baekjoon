import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 지형 랜더링 알고리즘 구현하기
		// 지불에 필요한 동전의 수를 공백으로 구분하여 한 줄로 출력
		// 필요한 변수 
		// 한 변에 생기는 새로운 점 2(pow, 2, n) 2의 제곱으로 올라갈 변수 1개
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = (int)(Math.pow(2, a));
		System.out.println((int)Math.pow(1+b, 2));
	}
}