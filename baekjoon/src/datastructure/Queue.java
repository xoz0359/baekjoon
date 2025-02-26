package datastructure;

public interface Queue {
	
	public abstract void push(Object o); // 정수 x를 스택에 넣는 기능
	
	public abstract Object pop(); // 스택 가장 위에 있는 정수를 제거하고 제거한 수를 출력한다 (저장된 정수가 없을 경우에는 -1을 출력)
	
	public abstract int size();
	
	public abstract boolean empty();
	
	public abstract Object front();
	
	public abstract Object back();
	
	

}
