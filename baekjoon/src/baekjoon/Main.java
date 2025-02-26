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
		int arr[] = new int[a];
		sb.append("<");
		int cnt = 0, num = 0, cnt2 = 0;
		boolean c = true;
		while (cnt2 <= a) {
			cnt++;
			num++;
			num = num > a ? 1 : num;
			System.out.println(num+" "+cnt);
			c = true;
			if (cnt == b) {
				cnt = 0;

				// 여기서 출구가 하나인 자료구조를 사용하면 시간복잡도를 더 줄일 수 있을 것 같다
				for (int i = num+cnt2; i < arr.length; i++) {
					if (arr[i - 1] == 0) {
						arr[num - 1] = 1;
						sb.append(i + " ");
						break;
					}
					for (int j = 1; j <= num+cnt2; j++) {
						if (arr[j - 1] == 0) {
							arr[num - 1] = 1;
							sb.append(j + " ");
							break;
						}
					}
					
				}
				cnt2++;
			}
		}
		String str = sb.substring(0, sb.length() - 1);
		str = str.replace(" ", ", ");
		System.out.println(str + ">");
	}
}