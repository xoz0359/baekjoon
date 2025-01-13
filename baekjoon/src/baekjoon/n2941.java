package baekjoon;

import java.util.Scanner;


public class n2941 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str2[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String str1 = input.next();
		
		int cnt = 0;
		
		for (int i=0; i<str2.length; i++) {
			while(-1!=str1.indexOf(str2[i])){
				str1 = str1.replaceFirst(str2[i], " ");// 의도적으로 공백을 추가해 원본수정에 의한 오류를 제어했습니다
				cnt++;
			}
		}
		str1 = str1.replace(" ", "");
		System.out.println(cnt+str1.length());
	
	}
}