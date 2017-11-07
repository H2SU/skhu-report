
/*
 * ���ϸ�: MyLinkedList.java
 * �ۼ���: �����
 * �ۼ���: 2017�� 9�� 22��
 * ����: �����ڷᱸ���� ��������Ʈ�� ������ MyLinkedList Ŭ����
 */

public class MyLinkedList 
{
	// (1) �ν��Ͻ� ���� head ����: ���Ḯ��Ʈ�� ù��° ��带 ����Ŵ
	private Node head;	
	private int len;// (2) ��Ÿ �ʿ��� �ν��Ͻ� ���� ����

	// (3) ����ִ� ����Ʈ�� ����
	public MyLinkedList() 
	{
		head = null;
		len = 0;
	}

	// (4) ����Ʈ�� �� �տ� item�� ����
	public void addFirst(int item) 
	{
		if(head==null)
		{
			Node newnode = new Node(item); // data �ʵ尡 item�� ���ο� Node ��ü�� ����(newNode)	
			head = newnode;
		}

		else
		{
			Node newnode = new Node(item, head);
			head = newnode;
		}

		len++;
		// head�� ����Ű�� ���Ḯ��Ʈ�� �� �տ� newNode�� ����
	}

	// (5) ����Ʈ�� ���̸� ����
	public int size() 
	{
		return len;
	}

	// ����Ʈ ���ҵ��� ��� ���
	public void printList() 
	{
		Node temp = head;
		System.out.print("[");
		while(temp != null) 
		{
			System.out.print(temp.data);
			temp = temp.link;
			if(temp != null)
				System.out.print(", ");
		}
		System.out.println("]");
	}

	public int removeFirst()
	{
		Node temp = head;
		head = head.link;
		return temp.data;
	}

	public boolean contains(int num)
	{
		Node temp = head;
		while(temp != null)
		{
			if(temp.data==num)
			{
				return true;
			}
			else
			{
				temp = temp.link;
				continue;
			}
		}
		return false;
	}

	public void add(int index, int num)
	{
		Node temp = head;
		Node nd = new Node(num);

		if(index==0)
		{
			nd.link = head;
			head = nd;
		}
		else
		{
			for(int i=0;i<index-1;i++)
			{

				temp = temp.link;
			}
			nd.link = temp.link;
			temp.link = nd;
		}
	}

	public int remove(int index)
	{
		Node temp = head;
		if(index==0)
		{
			head = temp.link;
			return temp.data;
		}
		else
		{
			for(int i=0; i<index-1; i++)
			{
				temp = temp.link;
			}

			Node temp2 = temp.link;
			temp.link = temp.link.link;
			return temp2.data;
		}

	}

	@Override
	public String toString() 
	{
		StringBuffer str = new StringBuffer("[");
		Node temp = head;

		while(temp != null) 
		{
			str.append(temp.data);
			temp = temp.link;

			if(temp != null)
				str.append(", ");
		}
		str.append("]");

		return str.toString();
	}

	// ���Ḯ��Ʈ ��� ������ ǥ���ϴ� private Ŭ����
	private class Node 
	{
		int data;	 // (6) �������� ������ ������ �ʵ� data ����
		Node link;	 // (7) ���� ��� �������� ������ ��ũ �ʵ�link ����

		Node() 
		{
			data = 0;
			link = null;
		}

		Node(int data) 
		{
			this.data = data;
			this.link = null;
		}

		Node(int data, Node link) 
		{
			this.data = data;
			this.link = link;
		}
	}
}


