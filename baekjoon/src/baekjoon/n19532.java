package baekjoon;

import java.util.*;

public class n19532 {

	public static void main(String[] args) {
		// ax + by = c, dx + ey = f �� ���������Ŀ��� ���� a~f�� �־����� �� x, y�� ���ϴ� ���α׷�
		// ���������� Ǯ�̿� �ݺ����� ����� Ǯ�� �� �� �����غ���
		// ���������� Ȱ���� �� �ð����⵵�� ���� Ǯ�� ������
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		
		
		// �ݺ����� Ȱ���� Ǯ��
		for (int i=-999; i<1000; i++) {
			for (int j =-999; j<1000; j++) {
				if(a*i + b*j == c && d*i + e*j == f) {
					System.out.print(i+" "+j);
				}
			}
		}
		// ������������ �������� Ȱ���� Ǯ��
		System.out.println(((e*c-b*f)/(e*a-b*d))+" "+((c*d-a*f)/(b*d-a*e)));
		
		
		
	}
}