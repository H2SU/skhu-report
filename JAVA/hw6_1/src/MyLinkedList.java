
/*
 * 파일명: MyLinkedList.java
 * 작성자: 김희수
 * 작성일: 2017년 9월 22일
 * 내용: 연결자료구조로 선형리스트를 구현한 MyLinkedList 클래스
 */

public class MyLinkedList 
{
	// (1) 인스턴스 변수 head 선언: 연결리스트의 첫번째 노드를 가리킴
	private Node head;	
	private int len;// (2) 기타 필요한 인스턴스 변수 선언

	// (3) 비어있는 리스트를 생성
	public MyLinkedList() 
	{
		head = null;
		len = 0;
	}

	// (4) 리스트의 맨 앞에 item을 삽입
	public void addFirst(int item) 
	{
		if(head==null)
		{
			Node newnode = new Node(item); // data 필드가 item인 새로운 Node 객체를 생성(newNode)	
			head = newnode;
		}

		else
		{
			Node newnode = new Node(item, head);
			head = newnode;
		}

		len++;
		// head가 가리키는 연결리스트의 맨 앞에 newNode를 삽입
	}

	// (5) 리스트의 길이를 리턴
	public int size() 
	{
		return len;
	}

	// 리스트 원소들을 모두 출력
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

	// 연결리스트 노드 구조를 표현하는 private 클래스
	private class Node 
	{
		int data;	 // (6) 정수값을 저장할 데이터 필드 data 선언
		Node link;	 // (7) 다음 노드 참조값을 저장할 링크 필드link 선언

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


