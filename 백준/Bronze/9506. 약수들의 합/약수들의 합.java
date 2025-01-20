import java.util.*;

public class Main {

	public static void main(String[] args) {
		// a가 주어졌을 때 a가 완전 수인지, 만약 완전 수라면 a를 이루는 약수를 오름차순으로 출력하는 프로그램
		// 출력 형식 "28 = 1 + 2 + 4 + 7 + 14"
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>(0);

		int cnt = 0;
		while (true) {
		int a = input.nextInt();
		if (a==-1) {
			input.close();
			return;
		}
		
		int cnt2 = 0;
		arr.clear();
			while (true) {
				cnt2++;
				if (cnt2>=a) {
					break;
				}
				//System.out.println(a+"%"+cnt2+": "+a%cnt2);
				if (a%cnt2==0) {
					arr.add(cnt2);
				}
			}
			int in_num = 0;
			for (int i=0; i<arr.size(); i++) {
				in_num += arr.get(i);
			}
			
			
			if (in_num == a) {
				System.out.print(a + " = ");
				for (int i = 0; i < arr.size(); i++) {
					if (i + 1 == arr.size()) {
						System.out.println(arr.get(i));
						break;
					}
					System.out.print(arr.get(i) + " + ");
				}
			}else
				System.out.println(a+" is NOT perfect.");

		}
		
	}
}