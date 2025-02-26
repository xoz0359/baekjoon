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
		sb.append("<");
		int cnt = 0, cnt2 = a , num = 0, cnt3 = 0;
		while(cnt2 > 0) {
			System.out.println("cnt:"+cnt+"cnt2:"+cnt2+"num:"+num);
			if (sb.indexOf(num+"")!=-1) {
				
				num = num >= a ? 1: num+1;
				//System.out.println(sb.toString());
				continue;
			}
			if (cnt == b) {
				sb.append(num+" ");
				cnt2--;
				cnt = 0;
				//System.out.println(cnt2);
			}
			num = num >= a ? 1: num+1;
			cnt++;
		}
		String str = sb.substring(0, sb.length()-1);
		str = str.replace(" ", ", ");
		System.out.println(str+">");
	}
}