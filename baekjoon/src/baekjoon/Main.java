package baekjoon;

import java.io.*;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		Main mi = new Main();
		// BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		StringBuffer sb = new StringBuffer();
		// 시간 복잡도를 줄여보자
		int list[] = new int[a];
		for (int i = 1; i <= a; i++) {
			list[i-1] = i;
		}
		
		
		sb.append("<");
		int cnt = 0, cnt2 = 0;
		while (cnt2 < a) {
			for (int i = 0; i < a; i++) {
				if (list[i]==0) continue;
					cnt++;
				if (cnt == b) {
					cnt2++;
					cnt = 0;
					sb.append(list[i] + " ");
					list[i] = 0;
				}
	
			}
			//System.out.println(sb.toString());
		}
		String str = sb.substring(0, sb.length() - 1);
		str = str.replace(" ", ", ");
		System.out.println(str + ">");
	}
}