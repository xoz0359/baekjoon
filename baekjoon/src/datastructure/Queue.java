package datastructure;

public interface Queue {
	
	public abstract void push(Object o); // ���� x�� ���ÿ� �ִ� ���
	
	public abstract Object pop(); // ���� ���� ���� �ִ� ������ �����ϰ� ������ ���� ����Ѵ� (����� ������ ���� ��쿡�� -1�� ���)
	
	public abstract int size();
	
	public abstract boolean empty();
	
	public abstract Object front();
	
	public abstract Object back();
	
	

}
