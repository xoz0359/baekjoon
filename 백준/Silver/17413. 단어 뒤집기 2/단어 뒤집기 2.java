import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//charAt()이 문자열 사이의 공백을 임의로 처리해버려서 곤란했는데
		//toCharArray()는 문자열 사이의 공백 정보를 포함한 배열을 반환한다
		//애초에 char 타입의 배열은 공백을 저장할 수 있다
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		char a[] = input.readLine().toCharArray();
		StringBuffer sb = new StringBuffer();
		Deque<Character> arr = new LinkedList<Character>();
		boolean fb = true;
		int cnt = 0;
		int leng = a.length;
		for (int i = 0; i < a.length; i++) {
			cnt++;
			arr.addLast(a[i]);
			if (a[i]=='<') {
					char temp = arr.pollLast();
				while(!arr.isEmpty()) {
					sb.append(arr.pollLast());
				}
				sb.append(temp);
				fb = false;
			}else if (a[i]=='>') {
				while(!arr.isEmpty()) {
					sb.append(arr.pollFirst());
				}
				fb = true;
			}
			
			if (a[i]==' ' && fb == true) {
					char temp = arr.pollLast();
				while(!arr.isEmpty()) {
					sb.append(arr.pollLast());
				}
					sb.append(temp);
				
			}
			
		}
		while(!arr.isEmpty()) {
			sb.append(arr.pollLast());
		}
		
		System.out.println(sb.toString());
		
		
	}
}