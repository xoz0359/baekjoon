import java.io.*;

public class Main <T> {
	
	static Object[] arr;
	static int capacity;
	int size;
	
	public Main() {
		arr = new Object[0];
		capacity = 10;
		size = 0;
	}

	public void push(Object o) {
		size++;
		Object narr[] = new Object[size];
		for (int i = 0; i < size-1; i++) {
			narr[i] = arr[i];
		}
		arr = narr;
		arr[size-1] = o;
	}

	public Object pop() {
		if (size < 1) {
			return -1;
		}
		Object last = arr[size-1];
		size--;
		Object narr[] = new Object[size];
		for (int i = 0; i < size; i++) {
			narr[i]= arr[i];
		}
		arr = narr;
		return last;
	}

	public int size() {
		return size;
	}

	public int empty() {
		if (size > 0) {
			return 0;
		}else {
			return 1;
		}
	}

	public Object top() {
		if (size < 1) {
			return -1;
		}
		return arr[size-1];
	}

	public static void main(String[] args) 
	throws IOException{
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Main <Integer> s  = new  Main <Integer>();
		int a = Integer.parseInt(input.readLine());
		
		for (int i=0; i<a; i++) {
			String str = input.readLine(), odstr = "";
			int sl = str.length();
			for (int j = 0; j < sl; j++) {
				if (str.charAt(j)==' ') {
					odstr = str.substring(j+1);
					str = str.substring(0, j);
					break;
				}
			}

			if (str.equals("push")) {
				s.push(Integer.parseInt(odstr));
			}else if (str.equals("pop")) {
				System.out.println(s.pop());
			}else if (str.equals("size")) {
				System.out.println(s.size());
			}else if (str.equals("empty")) {
				System.out.println(s.empty());
			}else if (str.equals("top")) {
				System.out.println(s.top());
			}
			
		}
		
	}
}