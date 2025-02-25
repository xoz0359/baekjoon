import java.io.*;
import java.util.*;
import java.io.*;

public class Main {

	int arr[], temp[];
	int capacity; // 인스턴스의 크기 때문에 capacity가 필요한 것 같은데 전달 받는 값이 int 뿐이므로 생략
	int size;

	public Main() {
		arr = new int[0];
		capacity = 20;
		size = 0;
	}

	public void push(int n) {
		size++;
		temp = new int[size];
		temp[size - 1] = n;
		if (size > 1) {
			for (int i = 0; i < size - 1; i++) {
				temp[i] = arr[i];
			}
		}
		arr = temp;
	}

	public int pop() {
		if (size > 0) {
			size--;
			int first = arr[0];
			temp = new int[size];

			for (int i = 0; i < size; i++) {
				temp[i] = arr[i + 1];
			}

			arr = temp;
			return first;
		} else {
			return -1;
		}
	}

	public int size() {
		return size;
	}

	public int empty() {
		if (size > 0) {
			return 0;
		} else {
			return 1;
		}
	}

	public int front() {
		if (size > 0) {
			return arr[0];
		} else {
			return -1;
		}
	}

	public int back() {
		if (size > 0) {
			return arr[arr.length - 1];
		} else {
			return -1;
		}
	}

	public static void main(String[] args) throws IOException {

		Main mi = new Main();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		// Scanner input = new Scanner(System.in);
		int a = Integer.parseInt(input.readLine());
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < a; i++) {
			String str = input.readLine();
			if (str.equals("front")) {
				sb.append(mi.front() + "\n");
			} else if (str.equals("back")) {
				sb.append(mi.back() + "\n");
			} else if (str.equals("pop")) {
				sb.append(mi.pop() + "\n");
			} else if (str.equals("empty")) {
				sb.append(mi.empty() + "\n");
			} else if (str.equals("size")) {
				sb.append(mi.size() + "\n");
			} else {
				mi.push(Integer.parseInt(str.substring(str.indexOf(" ")+1)));
			}
		}
		System.out.println(sb.toString());
	}
}