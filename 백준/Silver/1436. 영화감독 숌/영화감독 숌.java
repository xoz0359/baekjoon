import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		
		// n번째 종말의 수를 구하는 프로그램 만들기
		int num = 666, cnt = 1;
		
		while (cnt < n) {
			num++;
			String n_s = String.valueOf(num);
			boolean a = false;
			int cnt2 = 0;
			for (int i = 0; i < n_s.length(); i++) {
				if (n_s.charAt(i) == '6') {
					a = true;
					if (a) {
						cnt2++;
						if (cnt2 == 3) {
							cnt++;
							break;
						}
					}
				}else {
					cnt2 = 0;
					a = false;
				}
			}
			
			
		}
		
		System.out.println(num);
	}
}