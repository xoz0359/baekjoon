package baekjoon;

import java.util.Scanner;


public class n1316 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int a2 = a;
		for (int i=0; i<a; i++) {
			char b[] = input.next().toCharArray();//nextLine은 입력을 기다리지 않고 실행된다
			int te = -1;
			int c[] = new int['z'-'a'+1];
			for (int j=0; j<b.length; j++) {
				if (c[b[j]-'a'] == 0 || te == b[j]) {
					c[b[j]-'a']++;
					te = b[j];
				}else {
					a2--;
					break;
				}
			}
			
		}
		System.out.println(a2);
		
		
	}
}