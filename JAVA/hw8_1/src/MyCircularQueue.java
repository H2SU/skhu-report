
public class MyCircularQueue {
	private int[] arr;
	private int front = 0;
	private int rear = 0;
	private int size;
	
	public MyCircularQueue(int size)
	{
		this.size = size;
		this.arr = new int[this.size];
	}
	
	public boolean isEmpty()
	{
		return rear == front;
	}
	
	public boolean isFull()
	{
		return ((rear+1)%size) == front;
	}
	
	public void enQueue(int item) {
		
	}
}
