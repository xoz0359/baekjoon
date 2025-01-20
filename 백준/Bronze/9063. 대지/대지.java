import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 논밭의 넓이를 구하는 프로그램
		Scanner input = new Scanner(System.in);
		int pn = input.nextInt();
		int arr[][] = new int [pn][2];
		int mainnum[] = new int [2];
		for (int i=0; i<pn; i++) {
			arr[i][0] = input.nextInt();
			arr[i][1] = input.nextInt();
		}
		
		int max = 0;
		int min = 0;
		int mainnum1 = 0, mainnum2 = 0;
		
		for (int k=0; k<2; k++) {
			max = arr[0][k];
			min = arr[0][k];
			for (int i=0; i<arr.length-1; i++) {
				if(max<arr[i+1][k]) {
					max = arr[i+1][k];
				}	
			}
			for (int i=0; i<arr.length-1; i++) {
				if(min>arr[i+1][k]) {
					min = arr[i+1][k];
				}	
			}
			mainnum[k] = max-min;
		}
		
		System.out.println(mainnum[0]*mainnum[1]);
		
	}
}