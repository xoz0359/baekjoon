package baekjoon;
	
	import java.util.*;
	
	public class n24313 {
	
		public static void main(String[] args) {
			// ������ �ð����⵵ ������ ����
			Scanner input = new Scanner(System.in);
			
			// �Լ� f(n)�� ��Ÿ���� ���� a, b
			int a1 = input.nextInt(); 
			int a0 = input.nextInt();
			// ���� ���� c
			int c = input.nextInt();
			// ���� ���� n
			int n = input.nextInt();
			
			// * ���� ���� ���ϰ� �ִ� �κ� g(n) == n�� �Ǵ� ������ ������ �𸣰��� 
			// n�� ���� ������ �Էµȴ�!
			// a1*n+a0 <= c*n
			// �׽�Ʈ ���̽� 7 7 8 1
			if (a1*n+a0 <= c*n && a1 <= c) {// a1�̳� a0�� ������ �Է� �Ǿ �׽�Ʈ �� �� �ִ� ������ ������ �Ѵ� 
				System.out.println(1);
			} else {
				System.out.println(0);
			}
			
			
			
		}
	}