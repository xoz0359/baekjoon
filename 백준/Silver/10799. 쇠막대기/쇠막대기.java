import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// 여러 개의 쇠막대를 레이저로 자를 때 총 몇 개의 조각이 발생하는지 계산하는 프로그램
		// 내가 구상하고 있는 로직 설명
		// 괄호가 시작 되고 다음에 만나는 문자열에 따라 값이 변하는 int 변수로
		// 매핑되는 괄호가 언제 끝날지 계산할 생각
		// 레이저를 의미하는 인접한 괄호는 다른 문자로 치환하면 보기 편하겠지만
		// 시간 복잡도를 줄이기 위해 따로 변환하지 않고
		// 인접한 괄호를 검출하는 코드를 먼저 작성해보겠음
		
		// 이제 조각의 총 개수에 대해 구해보자
		// '('이 시작하고부터 레이저를 만나면 
		// 레이저를 만나기 전 검출된 '(' 개수의 카운터만큼 쇠막대의 개수가 증가
		// ')'를 만날 때 쇠막대의 개수 증가
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		// 받은 문자열을 캐릭터 타입 배열로 치환
		char a[] = input.readLine().toCharArray();
		int cnt = 0; // 레이저를 만났을 때 겹쳐있는 쇠막대의 개수
		int total = 0; // 절단으로 발생한 조각의 개수
		int as = a.length;
		for (int i = 0; i < as; i++) {
			if(a[i]=='('&&a[i+1]==')') {
			// 인접한 괄호 검출 이 부분은 레이저이다
			// 현재 겹쳐져있는 쇠막대의 개수 만큼 조각이 발생
				total += cnt;
				i++;
			}else if(a[i]=='(') {
			// 쇠막대 한 개가 시작하는 지점
			// 겹쳐져 있는 쇠막대의 개수인 cnt++
				cnt++;
			}else if(a[i]==')') {
			// 쇠막대의 끝
				total ++;
				cnt--;
			}
		}
		System.out.println(total);
		
	}
}