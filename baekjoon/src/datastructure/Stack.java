package datastructure;

public interface Stack {
	// ���Լ��� �ڷᱸ���� ������ ���� �����غ���
	
	public abstract void push(Object o); // ���� x�� ���ÿ� �ִ� ���
	
	public abstract Object pop(); // ���� ���� ���� �ִ� ������ �����ϰ� ������ ���� ����Ѵ� (����� ������ ���� ��쿡�� -1�� ���)
	
	public abstract int size();
	
	public abstract boolean empty();
	
	public abstract Object top();


	
	
}
