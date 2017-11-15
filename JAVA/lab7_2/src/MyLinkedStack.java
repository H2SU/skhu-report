/*
 *  문제: 내부적으로 연결 자료구조로 구현한 정수 스택 추상자료형인 MyLinkedStack을 정의하고 이를 이용하는 프로그램을 작성하시오.
 *  작성자: 김희수
 *  작성일: 17.10.30.
 */
public class MyLinkedStack {
	private Node top=null;
	private int tmp = 0;
	
	public boolean isEmpty()
	{
		return (top == null);
	}
	
	public void push(int item)
	{ 
		Node n = new Node(item);
		n.link = top;
		top = n;
	}
	
	public int pop()
	{
		try{
			tmp = top.data;
			top = top.link;
		}catch(Exception e){
			System.out.println("원소가 없습니다"+ e.getMessage());
		}

		return tmp;
	}
	
	public int peek()
	{
		try {
			tmp = top.data;
		}catch(Exception e) {
			System.out.println("원소가 없습니다"+ e.getMessage());
		}
		return tmp;
	}
	
	private class Node
	{
		int data;
		Node link;
		
		Node(int data)
		{
			this.data = data;
			this.link = null;
		}
	}
}


