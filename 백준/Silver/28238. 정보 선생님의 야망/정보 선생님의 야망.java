import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 2월 코딩테스트 2번 문제
		// 입력 한계가 10만이기 때문에 시간 복잡도가 O(n^3)이상이면 시간초과가 발생할 것이다

		Scanner input = new Scanner(System.in);

		int c = input.nextInt();

		int arr[][] = new int[c][5];
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] += (input.nextInt());
			}
		}
		int maxindex[] = new int[2];
		int cnt = 0, max = 0;
		for (int k = 0; k < 5; k++) {
			for (int j = k+1; j < 5; j++) {
				cnt = 0;
				for (int i = 0; i < c; i++) {
					if (arr[i][k] == 1 && arr[i][j] == 1) {
						cnt++;
					}
				}
				if (cnt > max) {
					max = cnt;
					maxindex[0] = k;
					maxindex[1] = j;
				}
			}

		}
		int arr2[] = new int[5];
		
		System.out.println(max);
		if (max > 0) {
			arr2[maxindex[0]] = 1;
			arr2[maxindex[1]] = 1;
		} else {
			arr2[0] = 1;
			arr2[1] = 1;
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}