package baekjoon;

import java.util.*;

public class p_Spiralarr {

	public static void main(String[] args) {
		// 논밭의 넓이를 구하는 프로그램
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		int arr[][] = new int[a][a];
		int pas = 0;
		int cnt = 0, cnt2 = 0;
		int i = 0, j = 0, k = a, ft = 0;
		
		
		while (cnt<=Math.pow(a, 2)) {
			cnt++;
			ft++;
			switch(pas) {// 배열에 데이터 넣는 부분 pas의 값에 따라 인덱스 넘버 조작이 달라짐
			case 0 : // 왼쪽에서 오른쪽으로 
				arr[i][j]=cnt;
				j++;
				break;
			case 1 : // 위에서 아래로
				arr[i][j]=cnt;	
				i++;
				break;
			case 2 : // 오른쪽에서 왼쪽으로
				arr[i][j]=cnt;
				j--;
				break;
			default : // 아래에서 위로
				arr[i][j]=cnt;
				i--;
			}
			
			if (ft >= k-1) { // 제어 변수 매커니즘
				ft = 0;
				pas++;
				if (cnt2 >= 2) {
					cnt2 = 0;
					k--;
				}
				if (pas > 3) { 
					pas = 0;
				}
				cnt2++;
			}
		}
		
		for (int main=0; main < a; main++) {
			for (int sub=0; sub < a; sub++) {
				System.out.print(arr[main][sub]+"\t");
			}
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		}
		
	}
}