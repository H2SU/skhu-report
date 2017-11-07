/*
 * 파일명: MyDoublyLinkedList.java
 * 작성자: 김희수
 * 작성일: 2017년 10월 12일
 * 내용: 이중연결자료구조로 선형리스트를 구현한 MyDoublyLinkedList 클래스
 */

public class MyDoublyLinkedList 
{

	private Node head; // 리스트의 첫번째 노드를 가리킬 변수
	private int len; // 리스트의 원소 수를 나타내는 변수

	public MyDoublyLinkedList() 
	{
		head = null;
		len = 0;
	}

	// 리스트 길이를 리턴
	public int size() 
	{
		return len;
	}

	// 리스트의 맨 앞에 item을 삽입
	public void addFirst(int item) 
	{

		// (1) 데이터가 item인 새로운 노드 생성
		Node newnode = new Node(item);

		// (2) 새로운 노드를 리스트의 맨 앞에 삽입
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
		// (3) 원소 수 1 증가
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
			System.out.println("값이 없습니다.");
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

	// 리스트가 양방향연결이 제대로 이루어졌는지 확인
	public void printLink() 
	{
		if (head == null) 
		{
			System.out.println("공백리스트임");
		} 
		else 
		{
			// 리스트를 순방향으로 출력
			Node temp = head;
			System.out.print("리스트 길이=" + len + " 순방향 링크: ");
			while (temp.rlink != null) 
			{
				System.out.print(temp.data + "->");
				temp = temp.rlink;
			}
			System.out.print(temp.data);

			// 리스트를 역방향으로 출력
			System.out.print(" 역방향 링크: ");
			while (temp.llink != null) 
			{
				System.out.print(temp.data + "->");
				temp = temp.llink;
			}
			System.out.println(temp.data);
		}
	}

	// 이중연결리스트 노드 구조
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