
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 자연수 n이 주어졌을 때 n에 대한 가장 작은 생성자를 구하는 프로그램
		// 생성자의 조건
		// 가장 작은 자리수인 1, 0, 0을 시작으로 9, 9 ,9 사이의 자릿수의 합을 뺐을 때 생성자 본인과 같은 수가 나와야 한다 
		// 생성자가 없을 경우 0 출력
		// 분해합을 배열로 관리하면 이진탐색 알고리즘을 사용할 수 있을 것 같지만
		// 지금 하고 있는 단원은 브루트포스니깐 ㅎㅎ..
		Scanner input = new Scanner(System.in);

		String n = input.next();
		char arr[] = n.toCharArray();
		
		int num = Integer.parseInt(n), cnt = 0; //n의 정수값
		for (int i=0; i<arr.length; i++) {
			cnt += arr[i]; // n의 각 자릿수를 더한 분해값
		}
		
		
		int sum = 0, cnt2 = arr.length, sum2 = 0;
		int temp = 0;
		for (int i=num-cnt2*9; i < num; i++) { // 가장 작은 생성자를 구해야 함으로 제어변수는 점점 작아지게
			temp = 0;
			for (int j = 1; j <= cnt2; j++) {
				sum2 += ((int)(i%Math.pow(10, j)-temp)/Math.pow(10, j-1));
				temp = sum2;
			}			
			if (num-sum2 == i) {
				sum = i;
				System.out.println(sum);
				return;
			}
			sum2 = 0;
		}
		System.out.println(sum);
	}
}