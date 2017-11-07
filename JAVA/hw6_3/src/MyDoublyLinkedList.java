/*
 * ���ϸ�: MyDoublyLinkedList.java
 * �ۼ���: �����
 * �ۼ���: 2017�� 10�� 12��
 * ����: ���߿����ڷᱸ���� ��������Ʈ�� ������ MyDoublyLinkedList Ŭ����
 */

public class MyDoublyLinkedList 
{

	private Node head; // ����Ʈ�� ù��° ��带 ����ų ����
	private int len; // ����Ʈ�� ���� ���� ��Ÿ���� ����

	public MyDoublyLinkedList() 
	{
		head = null;
		len = 0;
	}

	// ����Ʈ ���̸� ����
	public int size() 
	{
		return len;
	}

	// ����Ʈ�� �� �տ� item�� ����
	public void addFirst(int item) 
	{

		// (1) �����Ͱ� item�� ���ο� ��� ����
		Node newnode = new Node(item);

		// (2) ���ο� ��带 ����Ʈ�� �� �տ� ����
		if (head == null) 
		{
			head = newnode;
		} 
		
		else 
		{
			newnode.rlink = head;
			newnode.rlink.llink = newnode;
			head = newnode;
		}
		// (3) ���� �� 1 ����
		len++;

	}

	public int removeFirst() 
	{
		int temp = 0;

		if (head != null) 
		{
			if (head.rlink == null) 
			{
				temp = head.data;
				head = head.rlink;
				len--;
			} 

			else 
			{
				temp = head.data;
				head.rlink.llink = head.llink;
				head = head.rlink;
				len--;
			}

		} 

		else 
		{
			System.out.println("���� �����ϴ�.");
			System.exit(0);
		}
		return temp;
	}

	public void remove(int num) 
	{
		if (head == null) 
		{
			return;
		}

		else if (head.rlink == null) 
		{
			if (head.data == num) 
			{
				head = null;
				len--;
			}

		} 

		else 
		{
			Node temp = head;

			if (head.data == num) 
			{
				head = head.rlink;
				len--;
			}

			else 
			{
				while (temp.rlink.rlink != null) 
				{
					if (temp.rlink.data == num) 
					{
						temp.rlink.rlink.llink = temp.rlink;
						temp.rlink = temp.rlink.rlink;
						len--;
						break;
					}
					temp = temp.rlink;

					if (temp.rlink.rlink == null) 
					{
						if (temp.rlink.data == num) 
						{
							temp.rlink = null;
							len--;
						}
					}

				}
			}
		}
	}

	@Override
	public String toString() 
	{
		StringBuffer str = new StringBuffer("[");
		Node temp = head;

		while (temp != null) 
		{
			str.append(temp.data);
			temp = temp.rlink;

			if (temp != null) 
			{
				str.append(", ");
			}
		}
		str.append("]");
		return str.toString();
	}

	// ����Ʈ�� ����⿬���� ����� �̷�������� Ȯ��
	public void printLink() 
	{
		if (head == null) 
		{
			System.out.println("���鸮��Ʈ��");
		} 
		else 
		{
			// ����Ʈ�� ���������� ���
			Node temp = head;
			System.out.print("����Ʈ ����=" + len + " ������ ��ũ: ");
			while (temp.rlink != null) 
			{
				System.out.print(temp.data + "->");
				temp = temp.rlink;
			}
			System.out.print(temp.data);

			// ����Ʈ�� ���������� ���
			System.out.print(" ������ ��ũ: ");
			while (temp.llink != null) 
			{
				System.out.print(temp.data + "->");
				temp = temp.llink;
			}
			System.out.println(temp.data);
		}
	}

	// ���߿��Ḯ��Ʈ ��� ����
	private class Node 
	{
		int data;
		Node llink;
		Node rlink;

		Node() 
		{
			this(0, null, null);
		}

		Node(int data) 
		{
			this(data, null, null);
		}

		Node(int data, Node llink, Node rlink) 
		{
			this.data = data;
			this.llink = llink;
			this.rlink = rlink;
		}
	}
}