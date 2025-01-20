import java.util.*;

public class Main {

	public static void main(String[] args) {
		// a개의 자연수가 주어지면 주어진 수 중의 소수가 몇 개 인지 구하는 프로그램
		// 입력이 최소 값일 때 오류
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		ArrayList <Integer> arr = new ArrayList<Integer>(0);
		
		int sum = 0;
		for (int i=a; i<=b; i++) {
			
			if (i<=1) {
				continue;
			}
			
			int cnt = 1;
			boolean isprime = true;
			while (cnt<i-1) {
				cnt++;
				if (i%cnt==0) {
					isprime = false;
					break;
				}	
			}
			if (isprime == true) {
				arr.add(i);
				sum += i;
			}
			
		}
		
		if (arr.size()==0) {
			System.out.println(-1);
			return;
		}
		System.out.println(sum);
		System.out.println(arr.get(0));
		
	}
}