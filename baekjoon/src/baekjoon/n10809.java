package baekjoon;

import java.util.Scanner;

public class n10809 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		char a[] = input.next().toCharArray();


		int b[] = new int['z'-'a'+1];
		int d[] = new int[b.length];
		
		for (int i=0; i<b.length; i++) {
			b[i]=-1;
		}
	
	
		for (int i=0;i<a.length-1;i++) {
			for (int j=i+1;j<a.length;j++) {
				if (a[i]==a[j]) {
					d[a[i]-'a'] = 1;
				}	
			}
			
		}
		
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<d.length; j++) {
				if (a[i]-'a'==j && d[j]<=1) {
					d[j]++;
					b[j] = i;
				}
			}
		}
		
		
		
		for (int j=0;j<b.length;j++) {
			System.out.print(b[j]+" ");	
		}
	}
}