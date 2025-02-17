import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int arr[] = new int [c];
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			int f = input.nextInt();
			int g = input.nextInt();
			arr [i] = (b - g) + f;

		}
		
		int min = 100000000;
		cnt = arr.length-1;
		for (int i = arr.length-1; i >= 0; i--) {
			if (arr[i] <= min) {
				min = arr[i];
				cnt = i;
			}
		}
		System.out.println(cnt+1);
		

	}

}