package hw8_2;

import java.util.NoSuchElementException;

public class MyLinkedQueue 
{
	private Node front = null;
	private Node rear = null;

	public boolean isEmpty() 
	{
		return front == null;
	}


	public void enQueue(int item) 
	{
		Node n = new Node();
		n.data = item;
		n.link = null;
		if(isEmpty()) {
			rear = n;
			front = n;
		}
		else {
			rear.link = n;
			rear = n;
		}
	}

	public int deQueue() throws NoSuchElementException{
		if(isEmpty())
		{
			throw new NoSuchElementException("큐가 비어있습니다");
		}
		int item = front.data;
		front = front.link;
		if(front == null) 
		{
			rear = null;
			return item;
		}

		return item;
	}
}

class Node{
	int data;
	Node link;
}
