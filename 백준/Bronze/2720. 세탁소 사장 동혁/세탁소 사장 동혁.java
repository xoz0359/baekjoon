import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 거스름 돈을 최소 개수의 동전으로 지불하는 프로그램
		// 동전의 종류
		// 페니 0.01$
		// 니켈 0.05$
		// 다임 0.10$
		// 쿼터 0.25$
		// 규칙
		// 거스름돈은 5$ 이하
		// 지불에 필요한 동전의 수를 공백으로 구분하여 한 줄로 출력
		
		Scanner input = new Scanner(System.in);
		int coin[][] = new int [4][2];
		coin[0][0] = 25;
		coin[1][0] = 10;
		coin[2][0] = 5;
		coin[3][0] = 1;
		
		int a = input.nextInt();
		for (int i = 0; i < a; i++) {
			int b = input.nextInt();
			for (int j = 0; j < coin.length; j++){ // 코인 개수 초기화
				coin[j][1] = b/coin[j][0]; 
				b%=coin[j][0];
			}
			for (int j = 0; j < coin.length; j++) {
				System.out.print(coin[j][1]+" ");
			}
			System.out.println();
		}
		
	}
}