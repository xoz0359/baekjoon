import java.io.*;
import java.util.*;
import java.io.*;

public class Main {
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		//Scanner input = new Scanner(System.in);
		String str = input.readLine();
		int a = Integer.parseInt(input.readLine());
		StringBuffer sb = new StringBuffer(str);
		int strleng = sb.length();
		int corindex = strleng;
		for(int i = 0; i < a; i++) {
			String str2 = input.readLine();
			if (str2.equals("L")){
				if (corindex != 0) {
					corindex--;
				}
			}else if (str2.equals("D")) {
				if (corindex != strleng) {
					corindex++;
				}
			} else if (str2.equals("B")) {
				if (corindex != 0) {
					corindex--;
					strleng--;
					sb.deleteCharAt(corindex);
				}
			} else {
				char ca = str2.charAt(str2.length() - 1);
					sb.insert(corindex, ca);
					corindex++;
					strleng++;
			}
		}
		System.out.println(sb.toString());
	}
}