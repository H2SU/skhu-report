/*
 *  ����: ���������� ���� �ڷᱸ���� ������ ���� ���� �߻��ڷ����� MyLinkedStack�� �����ϰ� �̸� �̿��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *  �ۼ���: �����
 *  �ۼ���: 17.10.30.
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
			System.out.println("���Ұ� �����ϴ�"+ e.getMessage());
		}

		return tmp;
	}
	
	public int peek()
	{
		try {
			tmp = top.data;
		}catch(Exception e) {
			System.out.println("���Ұ� �����ϴ�"+ e.getMessage());
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


