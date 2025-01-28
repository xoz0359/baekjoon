import java.util.*;

public class Main {

	public static void main(String[] args) {
		// n개의 정수가 주어지면 그 중 3개의 정수를 골라 m에 가장 가까운 m 이하의 합을 만들기
		// Brute Force 알고리즘
		// 그저 힘으로 결과를 도출하는 가장 단순한 알고리즘을 뜻한다
		// 해당 챕터에서는 고급 알고리즘 구현보다는 다양한 형태의 브루트 포스 알고리즘 설계에 중점을 두고 문제를 풀면 좋을 것 같다
		// 이 메소드의 시간복잡도는 Opow(n, 3)인데 입력 자릿수가 100장으로 제한되어 있다
		// 따라서 100만번의 시행 횟수가 허용될줄 알았는데 런타임에러가 발생했다
		// 추가적으로 구글링한 결과 처음에 구상했던 오름차순 정렬 후에 브루트포스 알고리즘을 구현하는 방식이 정답에 가깝다고 판단했다
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int m = input.nextInt();
		int arr[] = new int[n];
		
		for (int i=0; i<arr.length; i++) {
			arr[i]= input.nextInt();
		}
		
		int sum = 0, sum2 = 0, length = arr.length;
		
		for (int i=0; i<length-1; i++) {
			for (int j=i+1; j<length; j++) {
				if (arr[i]>arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		
		for (int i=0; i<length-1; i++) {
			for (int j = i+1; j < length; j++){
				for (int k = j+1; k < length; k++) {
					if(arr[i]+arr[j]+arr[k] > m) {
						break;
					}
					sum2 = arr[i]+arr[j]+arr[k];
					if (sum2 < m && sum < sum2) {
					sum = arr[i]+arr[j]+arr[k];	
					} else if (arr[i]+arr[j]+arr[k] == m) {
						sum = arr[i]+arr[j]+arr[k];
						System.out.println(sum);
						return;
					}
				}
			}
		}
		System.out.println(sum);
	}
}