import java.util.*;

public class Main {

	public static void main(String[] args) {
		// n진법의 수를 입력받아 10진수로 변환하는 프로그램
		// 런타임 에러 해결하면 끝 !
		// gpt계산 개못핵
		Scanner input = new Scanner(System.in);
		long a = input.nextLong();
		long b = input.nextLong();
		StringBuilder sb = new StringBuilder();

		
		
		while (true) {
			if (a / b >= b) { // a를 b로 또 나눌 수 있으면 1루프 추가
				if (a % b < 10) {// a / b > 0 && a / b < 10
					sb.append(a % b); 
				} else if (a % b >= 10) { // 나머지가 b보다 클 순 없지만 작을 수는 있다 조건문 필요
					sb.append((char) (a % b - 10 + 'A'));
				}
			} else if (a / b < b && a / b != 0){ // a/b가 1이면 나머지와 몫 추가
				if (a % b < 10) {
					sb.append(a % b);
				} else if (a % b >= 10) {
					sb.append((char) (a % b - 10 + 'A'));
				}
			} else if (a / b == 0 && a % b != 0) {
				if (a % b >= 10) { // 찾았다 = 연산자 빼먹어서 계산 값 중에 10이 나오면 char로 변환된 데이터가 들어가고 있었음
					sb.append((char) (a % b - 10 + 'A'));
					break;
				} else {
					sb.append(a % b);
					break;
				}
			} else {
				if (a / b >= 10) {
					sb.append((char) (a / b - 10 + 'A'));
					break;
				} else {
					sb.append(a / b);
					break;
				}
			}
			a = (int)(a/b);
		}
		sb.reverse();
		
		System.out.println(sb.toString());
	}
}