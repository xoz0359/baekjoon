import java.util.*;
import java.io.*;

public class Main {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Scanner input = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int a = Integer.parseInt(input.nextLine());
		for (int i=0; i<a; i++) {
			String str = input.nextLine();
			int f = 0, l = str.length();
			if (str.charAt(0)==')' || str.charAt(l-1)=='(' || l%2!=0) {
				sb.append("NO\n");
				continue;
			}
			while (str.indexOf("()") != -1) {
				str = str.replace("()", "");
			}
			
			// '(' 여는 괄호 하나당 문자열 끝에서부터 닿는 괄호가 추가로 필요하다
			
			if (str.length()==0) sb.append("YES\n");
			else sb.append("NO\n");
		}
		System.out.println(sb.toString());
	}
}