package baekjoon;

import java.util.*;
import datastructure.Stack;

public class Main implements Stack {
	
	static Object[] arr;
	static int capacity;
	int size;
	
	public Main() {
		arr = new Object[0];
		capacity = 10;
		size = 0;
	}

	@Override
	public void push(Object o) {
		size++;
		arr = new Object[size];
		arr[size-1] = o;

	}

	@Override
	public Object pop() {
		if (size < 1) {
			return -1;
		}
		Object last = arr[size-1];
		Object narr[] = new Object[size-1];
		size--;
		for (int i = 0; i < size-1; i++) {
			narr[i]= arr[i];
		}
		arr = narr;
		return last;
	
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean empty() {
		if (size > 0) {
			return true;
		}else {
			return false;
		}

	}

	@Override
	public Object top() {
		if (size < 1) {
			return -1;
		}
		return arr[size-1];

	}

	public static void main(String[] args) {
		
		Main s = new Main();
		System.out.println(s.size());
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		for (int i=0; i<a; i++) {
			if (input.next().equals("push")) {
				s.push(input.nextInt());
			}else if (input.next().equals("pop")) {
				System.out.println("pop:"+s.pop());
			}else if (input.next().equals("size")) {
				System.out.println("size"+s.size());
			}else if (input.next().equals("epmty")) {
				System.out.println("empty:"+s.empty());
			}else {
				System.out.println("top:"+s.top());
			}
		}
		
	}
}