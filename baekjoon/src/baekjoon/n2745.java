package baekjoon;

import java.util.*;

public class n2745 {

	public static void main(String[] args) {
		// n진법의 수를 입력받아 10진수로 변환하는 프로그램
		Scanner input = new Scanner(System.in);
		String n = input.next();
		StringBuilder sb = new StringBuilder(n);
		n = String.valueOf(sb.reverse()); // 계산하기 편하게 뒤집기
		int bnum = input.nextInt();
		int num = 0;
		int number = 0;
		for (int i=0; i<n.length(); i++) {
			if (n.charAt(i) >= '0' && n.charAt(i) <= '9') {
				num = Integer.valueOf((n.charAt(i)-'0'));
			} else if(n.charAt(i) >= 'A' && n.charAt(i) <= 'Z') {
				num = n.charAt(i)-'A'+10;
			}
			number += num*Math.pow(bnum, i); // pow 쓰니까 짱 편하다
		}
		System.out.println(number);
	}
}
