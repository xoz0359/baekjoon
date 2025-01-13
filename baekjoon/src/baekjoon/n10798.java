package baekjoon;

import java.util.Scanner;


public class n10798 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		todaySub ts = new todaySub();
		ts.todaySubject();
		
		String arr[] = new String [5];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = input.nextLine().replace(" ", "");
			/*
			 * for (int j =0; j<arr[i].length; j++) { if (str.length()-1 >= j) { arr[i][j] =
			 * String.valueOf(str.charAt(j)); // 캐릭터와 스트링 변환 String 클래스 안의 valueOf 메서드를 사용했다
			 * //arr[i][j] = (str.charAt(j)+""); // 연결 연산자를 활용해서 문자열로 치환하는 방법도 있다 } else if
			 * (str.length()-1 < j) { arr[i][j] = ""; }
			 * 
			 * }
			 */
		}
		
		for (int i=0; i<arr.length; i++) {
			for (int j =0; j<15; j++) {
				if (j >= arr[i].length()) {
					continue;
				}
				System.out.print(arr[i].charAt(j));
			}
			System.out.println();
		}
		
		System.out.println();
		for (int j =0; j<15; j++) {
			for (int i=0; i<arr.length; i++) {
				if (j >= arr[i].length()) {
					continue;
				}
				System.out.print(arr[i].charAt(j));
			}
			System.out.println();
		}
		
		
	}
}
