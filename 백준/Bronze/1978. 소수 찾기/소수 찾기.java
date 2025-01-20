import java.util.*;

public class Main {

	public static void main(String[] args) {
		// a개의 자연수가 주어지면 주어진 수 중의 소수가 몇 개 인지 구하는 프로그램
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		int numcnt = 0;
		for (int i=0; i<a; i++) {
			int b = input.nextInt();
			
			boolean isprime = true;
			if (b==1) {
				isprime = false;
				continue;
			}
			int cnt = 1;
			while (cnt<b-1) {
				cnt++;
				if (b%cnt==0) {
					isprime = false;
					break;
				}
				
			}
			if (isprime==true) {
				numcnt++;
			}
		}
		
		System.out.println(numcnt);
		
	}
}