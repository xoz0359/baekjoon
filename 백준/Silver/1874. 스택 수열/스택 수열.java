import java.util.*;
import java.io.*;

public class Main {
	

	public static void main(String[] args) {
		
		//BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Scanner input = new Scanner(System.in);
		Stack <Integer> s = new Stack<Integer>();
		StringBuffer sb = new StringBuffer(); 
		int a = input.nextInt();
		int cnt = 1;
		for (int i=0; i<a; i++) {
			int b = input.nextInt();
			if (cnt <= b) {
				//for (int j = cnt; j <= b; j++) {// j대신 cnt를 사용하고 싶었는데 for문의 절차상 for문이 끝날 때 cnt증가 연산을 한 번 더 실행해버린다
				while(cnt < b) {
					s.push(cnt++);
					sb.append("+\n");
				}
				s.push(cnt++);
				sb.append("+\n");
				int ip = s.pop();
				sb.append("-\n");
			}else {
				int sp = s.pop();
				if (sp == b) {
					sb.append("-\n");
				}else {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println(sb.toString());
	}
}