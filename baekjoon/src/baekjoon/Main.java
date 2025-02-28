package baekjoon;

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
		arr = new int[size];
	}
	
	public void push_back(int num) {
		
	}
	
	public int pop_front(int num) {
		
		return -1;
	}
	
	public int pop_back(int num) {
		
	}
	
	public int size() {
		
		return size;
	}
	
	public int empty() {
		
	}
	
	public int front() {
		
	}
	
	public int back() {
		
	}

	public static void main(String[] args) throws IOException {

		Main mi = new Main();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		//Scanner input = new Scanner(System.in);
		int a = Integer.parseInt(input.readLine());
		
		for (int i = 0; i < a; i++) {
			String str = input.readLine();
			if (str.equals("")) {
				
			}else if (str.equals("size")) {
				
			}else if (str.equals("empty")) {
				
			}else if (str.equals("front")) {
				
			}else if (str.equals("back")) {
				
			}else if (str.equals("push_front")) {
				
			}else if (str.equals("push_back")) {
				
			}else if (str.substring(0, 4).equals("pop_f")) {
				
			}else  {
				
			}
		}
		
	}
}