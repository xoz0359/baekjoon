package baekjoon;

import java.util.*;

public class n2563 {

	public static void main(String[] args) {
		// 필요한 배열
		// 10x10의 배열 공간
		// 사각형의 크기를 지정해주는 2x2 배열 좌표, 좌표
		// 해당 문제를 여러 번 겹치는 공간을 계산하는 수식으로 풀려고 접근했다가
		// 수식의 최대 실행 횟수가 입력값의 제곱승에 근접하는 문제가 발생해서
		// 풀이법을 바꾸었습니다
		// 수식을 활용하려고 짠 코드는 본문 밑에 주석 처리하였습니다
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();

		int square [][] = new int[a][2]; // 배열에 담아 구분해서 가공할 값이 두 개면 홀수 짝수로 나누어서 관리해도 되긴 하겠다 ㅎㅎ
		boolean space[][] = new boolean[100][100];
			
		for (int i=0; i<a; i++) {
			square[i][0] = input.nextInt(); // 가로 축으로 부터의 거리
			square[i][1] = input.nextInt(); // 세로 축으로 부터의 거리
		}
		
		for (int i=0; i<square.length; i++) {
			int width = square[i][0];
			int length = square[i][1]; 
			for (int j=width; j<width+10; j++) {
				for (int k=length; k<length+10; k++) {
					space[j][k] = true;
				}
			}
		}
		int cnt = 0;
		for (int i=0; i<space.length; i++) {
			for (int j=0; j<space.length; j++) {
				
				if (space[i][j] == true) {
					//System.out.print(1);
					cnt++;
				}else {
				//	System.out.print(0);
				}
			}
			//System.out.println();
		}
		
		System.out.println(cnt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ArrayList a1 = new ArrayList(a);
//		ArrayList a2 = new ArrayList(a);
//		ArrayList a3 = new ArrayList(a);
//		ArrayList a4 = new ArrayList(a);
//		ArrayList<Integer> arr[] = new ArrayList[4]; // 0, 1 좌표1 2, 3 좌표2
//
//		ArrayList b1 = new ArrayList();
//		ArrayList b2 = new ArrayList();
//		ArrayList b3 = new ArrayList();
//		ArrayList b4 = new ArrayList();
//		ArrayList<Integer> arr2[] = new ArrayList[4];
//
//		// 좌변과의 거리의 차이가 10보다 작으면 겹치는 부분의 영역을 구해서 전체 넓이에서 빼야 함
//		// 아랫변과의 거리도 마찬가지
//		// 만약 겹치는 영역이 서로 겹치면 서로 겹치는 영역도 생각해야 한다
//		arr[0] = a1;
//		arr[1] = a2;
//		arr[2] = a3;
//		arr[3] = a4;
//
//		arr2[0] = b1;
//		arr2[1] = b2;
//		arr2[2] = b3;
//		arr2[3] = b4;
//
//		for (int i = 0; i < a; i++) {
//			a1.add(input.nextInt());
//			a2.add(input.nextInt());
//			a3.add(10);
//			a4.add(10);
//		}
//
//		// 컬렉션으로 다차원 배열을 만들면
//		// 자식 배열의 geceric은 부모 배열의 generic을 따라간다
//		int an = 0;
//		int an2 = 0;
//		int cnt= a;
//		
//		for (int i = 0; i < arr[0].size()-1; i++) {// 할일!! 2중 for 문으로 고정비교자와 이동비교자 구현하기
//			for (int j = i + 1; j < arr[0].size(); j++) {
//				if (arr[0].get(i) == arr[0].get(j) && arr[1].get(i) == arr[1].get(j)) {
//					arr[0].remove(j);
//					arr[1].remove(j);
//					arr[2].remove(j);
//					arr[3].remove(j);
//					j--;
//					cnt--;
//					
//					
//					/*
//					 * for (int ii = 0; ii< arr[0].size(); ii++) { for (int jj = 0; jj <
//					 * arr[0].size(); jj++) { System.out.println(arr[0].get(jj));
//					 * System.out.println(arr[1].get(jj)); System.out.println(arr[2].get(jj));
//					 * System.out.println(arr[3].get(jj)); } System.out.println(); }
//					 */
//					 
//				}
//			}
//		}
//
//		
//		for (int i = 0; i < arr[0].size()-1; i++) {// 할일!! 2중 for 문으로 고정비교자와 이동비교자 구현하기
//			for (int j = i + 1; j < arr[0].size(); j++) {
//				// 겹치는 영역 구하기 min에 저장된 객체가 주소를 가리킴
//				// 부모 배열의 generic을 Integer로 변경 하니까 자식 배열도 함께 제너릭 됨
//
//				if (Math.abs(arr[0].get(i) - arr[0].get(j)) >= arr[2].get(i) || Math.abs(arr[1].get(i) - arr[1].get(j)) >= 10) {
//					continue;
//				}
//				
//				arr2[0].add(arr[0].get(i) > arr[0].get(j) ? arr[0].get(i) : arr[0].get(j));
//				arr2[1].add(arr[1].get(i) > arr[1].get(j) ? arr[1].get(i) : arr[1].get(j));
//				arr2[2].add(arr[2].get(i)-Math.abs(arr[0].get(i)-arr[0].get(j)));	
//				arr2[3].add(arr[3].get(i)-Math.abs(arr[1].get(i)-arr[1].get(j)));
//																											
//
//				an += arr2[2].get(arr2[2].size() - 1) * arr2[3].get(arr2[2].size() - 1);
//				
//				
//				/*
//				 * System.out.println(arr2[0].get(arr2[2].size() - 1));
//				 * System.out.println(arr2[1].get(arr2[2].size() - 1));
//				 * System.out.println(arr2[2].get(arr2[2].size() - 1));
//				 * System.out.println(arr2[3].get(arr2[3].size() - 1));
//				 */ 
//				 System.out.println("an:" + an);
//				 
//
//			}
//		}
//	
//		
//		for (int i = 0; i < arr2[0].size() - 1; i++) {// 할일!! 2중 for 문으로 고정비교자와 이동비교자 구현하기
//			for (int j = i + 1; j < arr2[0].size(); j++) {
//	
//				if (arr2[0].get(i) == arr2[0].get(j) && arr2[1].get(i) == arr2[1].get(j)) {
//				continue;	
//				}
//				
//				if (Math.abs(arr2[0].get(i) - arr2[0].get(j)) >= arr2[2].get(i)
//					|| Math.abs(arr2[1].get(i) - arr2[1].get(j)) >= arr2[3].get(i)) {
//					continue;
//				}
//				int no1;
//				int no2;
//				
//				/*
//				 * System.out.println(arr2[0].get(i)); System.out.println(arr2[1].get(i));
//				 * System.out.println(arr2[2].get(i)); System.out.println(arr2[3].get(i));
//				 * System.out.println(); System.out.println(arr2[0].get(j));
//				 * System.out.println(arr2[1].get(j)); System.out.println(arr2[2].get(j));
//				 * System.out.println(arr2[3].get(j));
//				 */
//				no1 = arr2[2].get(i)-Math.abs(arr2[0].get(i)-arr2[0].get(j)); 
//				no2 = arr2[3].get(i)-Math.abs(arr2[1].get(i)-arr2[1].get(j)); 
//																											
//				an2 += no1 * no2;
//				System.out.println("an2:" + an2);
//			}
//
//		}
//
//		System.out.println(cnt * 100 - an + an2);

	}
}
