import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// 사각형의 넓이를 구하는 프로그램
		
		Scanner input = new Scanner(System.in);

		int arr[][] = new int[3][2];
		for (int i = 0; i < 3; i++) {
			arr[i][0] = input.nextInt();
			arr[i][1] = input.nextInt();
		}

		for (int i = 0; i < 2; i++) {
			int j = 0;
			if (arr[j][i] == arr[j + 1][i]) {
				System.out.print(arr[j + 2][i]);
			} else if (arr[j][i] == arr[j + 2][i]) {
				System.out.print(arr[j + 1][i]);
			} else {
				System.out.print(arr[j][i]);
			}
			System.out.print(" ");
		}
	}
}