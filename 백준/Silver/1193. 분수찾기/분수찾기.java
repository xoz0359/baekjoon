
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 정수 a가 주어졌을 떄 알고리즘에 따른 a의 좌표 구하기
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		// i, j는 배열을 지그재그로 이동하는 인덱스 num
		// 이동횟수 a는 어떻게 표현할 수 있을까?
		int cnt = 0, execu = 0;
		while (true) {
			cnt++;
			int j = cnt;
			for (int i = 0; i<cnt; i++) {
				execu++;
				j--;
				if (execu == a) {
					if (cnt%2 == 1) {// cnt가 홀짝이 바뀌면 i, j 스왑 하기 
						int temp;
						temp = i;
						i = j;
						j = temp;
					}
					System.out.println(i+1+"/"+(j+1));	
					return;
				}
				
			}
			
		}
		
	}
}