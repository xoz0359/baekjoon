package baekjoon;

import java.util.*;

public class n2798 {

	public static void main(String[] args) {
		// n���� ������ �־����� �� �� 3���� ������ ��� m�� ���� ����� m ������ ���� �����
		// 1. �־��� ������ ������������ �����ϱ�
		// 2. ���� ���� ���� ���ϰ� 
		Scanner input = new Scanner(System.in);

		// �Լ� f(n)�� ��Ÿ���� ���� a, b
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