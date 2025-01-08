package baekjoon;

import java.util.Scanner;


public class n1157 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String as = input.nextLine();
		as = as.toLowerCase();
		char a[] = as.toCharArray();
		long b[] = new long['z'-'a'+1];
		int arrnum = a.length;
		
		for (int i = 0; i<arrnum; i++) {// 반복문 안에 기능 메소드를 넣으면 시간 복잡도가 과도하게 증가한다
			b[a[i]-'a']+=1;
		}
		
		
		System.out.println();
		long max = 0;
		int max_in = 0;
		for (int i = 0; i<b.length; i++) {
			if (max < b[i]) {
				max = b[i];
				max_in = i;
			}
		}
		
		boolean g = true;
		for (int i = 0; i<b.length; i++) {
			if (b[i]==b[max_in]&&i!=max_in) {
				g = false;	
			}
		}
		
		if (g == true) {
			System.out.println((char)(max_in+'A'));
		}
		else {
			System.out.println("?");
		}	
	}
}