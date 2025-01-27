package baekjoon;

import java.util.*;

public class n2798 {

	public static void main(String[] args) {
		// n개의 정수가 주어지면 그 중 3개의 정수를 골라 m에 가장 가까운 m 이하의 합을 만들기
		// 1. 주어진 수열을 오름차순으로 정렬하기
		// 2. 가장 작은 수를 구하고 
		Scanner input = new Scanner(System.in);

		// 함수 f(n)을 나타내는 정수 a, b
		int n = input.nextInt();
		int m = input.nextInt();
		int arr[] = new int[n];
		
		for (int i=0; i<arr.length; i++) {
			arr[i]= input.nextInt();
		}
		
		
		for (int i=0; i<arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++){
				int temp = 0;
				if (arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		int min = m - arr[0];
		int sum = 0;
		for (int i = 1; i<arr.length; i++) {
			for (int j = i+1; j<arr.length; j++) {
				
				if (arr[0]+arr[i]+arr[j] < min) {
					sum = min+arr[i]+arr[j];
				}else if (sum == m) {
					System.out.println(sum);
					return;
				}
			}
		}
		System.out.println(sum);
	}
}