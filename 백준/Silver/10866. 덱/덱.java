import java.io.*;
import java.util.*;

public class Main {
	int size;
	int arr[];
	
	public Main() {
		arr = new int[0];
		size = 0;
	}
	
	public void push_front(int num) {
		size++;
		int temp[] = new int[size];
		temp[0] = num;
		for (int i = 1; i < size; i++) {
			temp[i] = arr[i-1];
		}
		arr = temp;
	}
	
	public void push_back(int num) {
		size++;
		int temp[] = new int[size];
		temp[size-1] = num;
		for (int i = 0; i < size-1; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}
	
	public int pop_front() {
		if (size == 0) {
			return -1;
		} else {
			size--;
			int temp[] = new int[size];
			int frontnum = arr[0];
			for (int i = 0; i < size; i++) {
				temp[i] = arr[i+1];
			}
			arr = temp;
			return frontnum;
		}
	}
	
	public int pop_back() {
		if (size == 0) {
			return -1;
		} else {
			size--;
			int temp[] = new int[size];
			int backnum = arr[size];
			for (int i = 0; i < size; i++) {
				temp[i] = arr[i];
			}
			arr = temp;
			return backnum;
		}
	}
	
	public int size() {
		return size;
	}
	
	public int empty() {
		if (size > 0) {
			return 0;
		}
		return 1;
	}
	
	public int front() {
		if (size > 0) {
			return arr[0];
		}
		return -1;
	}	
	
	public int back() {
		if (size > 0) {
			return arr[size-1];
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {

		Main mi = new Main();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		//Scanner input = new Scanner(System.in);
		int a = Integer.parseInt(input.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < a; i++) {
			String str = input.readLine();
			if (str.equals("size")) {
				sb.append(mi.size()+"\n");
			}else if (str.equals("empty")) {
				sb.append(mi.empty()+"\n");
			}else if (str.equals("front")) {
				sb.append(mi.front()+"\n");
			}else if (str.equals("back")) {
				sb.append(mi.back()+"\n");
			}else if (str.equals("pop_front")) {
				sb.append(mi.pop_front()+"\n");
			}else if (str.equals("pop_back")) {
				sb.append(mi.pop_back()+"\n");
			}else if (str.substring(0, 6).equals("push_f")) {
				mi.push_front(Integer.parseInt(str.substring(11)));
			}else  {
				mi.push_back(Integer.parseInt(str.substring(10)));
			}
		}
		System.out.println(sb.toString());
	}
}