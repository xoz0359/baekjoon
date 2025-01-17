
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 벌집을 이동하는데 필요한 최소 칸수 구하기
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int cnt = 1;
		int cnt2 = 1;
		while(true) {
			if (a <= cnt) {
				break;
			}
			cnt+=6*cnt2;
			cnt2++;
		}
		System.out.println(cnt2);
	}
}