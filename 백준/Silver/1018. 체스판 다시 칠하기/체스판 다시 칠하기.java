
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 임의로 주어지는 보드로 8*8 체스판을 만들 때 도색이 필요한 최소 영역을 구하는 프로그램
		// 1. 반복문 3개 중첩 사용
		// 2. 반복문 2개, string 사용
		// 우선 3개의 반복문을 중첩해서 사용해보고 시간초과가 발생한다면 2번으로 직렬개발
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int m = input.nextInt();
		input.nextLine();
		String arr[] = new String[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextLine();
		}
		int cnt = -1, cnt2 = -1, cnx = 0, cny = 0, min = n*m;
		while (true) {
			cnt = 0;
			cnt2 = 0;

			char wb = 'B';
			for (int i = 0 + cny; i < 8 + cny; i++) {
				for (int j = 0 + cnx; j < 8 + cnx; j++) {
					
					if (wb == 'W') {
						wb = 'B';
					} else {
						wb = 'W';
					}
					if (arr[i].charAt(j) == wb) {
						cnt++;
					}			
				}
				if (wb == 'W') {
					wb = 'B';
				} else {
					wb = 'W';
					
				}
			}
			
			wb = 'W';
			for (int i = 0 + cny; i < 8 + cny; i++) {
				for (int j = 0 + cnx; j < 8 + cnx; j++) {
					
					if (wb == 'W') {
						wb = 'B';
					} else {
						wb = 'W';
					}
					if (arr[i].charAt(j) == wb) {
						cnt2++;
						if(cnt2 == 32) {
						}
					}
				}
				if (wb == 'W') {
					wb = 'B';
				} else {
					wb = 'W';
				}
			}
		
			cnx++;
			if(min > (cnt < cnt2 ? cnt : cnt2)) {
				min = cnt < cnt2 ? cnt : cnt2;
			}
			if (cnx + 8 > m) {
				cny++;
				cnx = 0;
			}
			if (cny + 8 > n) { //1+8 > 8
				System.out.println(min);
				return;
			}			
		}

		
	}
}