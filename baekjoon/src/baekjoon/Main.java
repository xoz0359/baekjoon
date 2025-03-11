package baekjoon;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String a = input.readLine();
		StringBuffer sb = new StringBuffer();
		Deque<Character> arr = new LinkedList<Character>();
		for (int i = 0; i < a.length(); i++) {
			arr.add(a.charAt(i));
			if(arr.peekFirst() == '<') {
				while(arr.peekFirst().equals('>')) {
					sb.append(arr.pollFirst());
				}
			}else if(arr.peekFirst() == ' ')) {
				
			}
			
		}
		System.out.println(sb.toString());
		
		
	}
}