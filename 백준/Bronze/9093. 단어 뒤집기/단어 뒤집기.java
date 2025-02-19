
import java.util.*;
import java.io.*;

public class Main {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(input.readLine());
		Stack<Character> s = new Stack<Character>();
		StringBuffer sb = new StringBuffer();
		
		for (int i=0; i<a; i++) {
			
			String str = input.readLine();
			int n = str.length();
			for (int j= 0 ; j < n; j++) {
				if (str.charAt(j) == ' ') {
					int m = s.size();
					for (int k = 0; k < m; k++) {
						sb.append(s.pop());
					}
					sb.append(' ');
				}else {
					s.push(str.charAt(j));
				}
			}
			int m = s.size();
			for (int k = 0; k < m; k++) {
				sb.append(s.pop());
			}
			System.out.println(sb.toString());	
			sb.delete(0, sb.length());
		}
		
		
	}
}