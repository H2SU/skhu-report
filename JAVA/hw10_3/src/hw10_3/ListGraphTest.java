package hw10_3;

/*
 * ���ϸ�: ListGraphTest.java
 * �ۼ���: 2017.12.08
 * �ۼ���: �������
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ListGraphTest {

	public static void main(String[] args) {
		System.out.println("hw10_3 : �����");

		Scanner input = new Scanner(System.in);
		System.out.print("���� �� �Է�: ");
		int n = input.nextInt();

		ListGraph graph = new ListGraph(n);

		System.out.println("�޴� ��ȣ�� �Է��ϼ���.");
		int menu = 0;
		int item = 0;
		int v1 = 0;
		int v2 = 0;

		do {
			System.out.print("1:�������� 2:����������� 3:DFS 4:BFS 5:���� --->");
			menu = input.nextInt();
			switch(menu) {
			case 1:
				System.out.print("���� v1 �Է�: ");
				v1 = input.nextInt();
				System.out.print("���� v2 �Է�: ");
				v2 = input.nextInt();
				graph.addEdge(v1, v2);
				break;
			case 2:
				System.out.print("���� �Է�:");
				v1 = input.nextInt();
				graph.printAdjacentVertices(v1);
				break;
			case 3:
				System.out.println("���̿켱Ž�� ������� ������ ����մϴ�.");
				graph.depthFirstSearch();
				break;
			case 4:
				System.out.println("�ʺ�켱Ž�� ������� ������ ����մϴ�.");
				graph.breadthFirstSearch();
				break;
			case 5:
				System.out.println("�����մϴ�.");
				break;
			default:
				System.out.println("�޴� ��ȣ ���� - �޴��� �ٽ� �����ϼ���.");
			}
		} while(menu != 5);

	}
}
class ListGraph {
	private Node[] list;
	private int n;
	private boolean[] dfsVisit; 
	private boolean[] bfsVisit;

	public ListGraph(int n) {
		list = new Node[n];
		this.n = n;
		dfsVisit = new boolean[n];
		bfsVisit = new boolean[n];
	}

	private boolean find(int v1, int v2) {
		Node temp = list[v1];
		if(temp == null)
			return false;
		else
			while(temp.vertex != v2) { 
				temp = temp.link;
				if(temp == null)
					return false;
			}
		return true;
	}

	private void add (int v1, int v2) {
		Node newNode = new Node();
		newNode.vertex = v2;
		newNode.link = list[v1];
		list[v1] = newNode;
	}

	public void addEdge(int v1, int v2) {
		if(v1<0 || v1>=n || v2<0 || v2>=n)
			System.out.println("���� ���� ���� - �߸��� ���� ��ȣ�Դϴ�.");
		else if (find(v1, v2))
			System.out.println("���� ���� ���� - �̹� �����ϴ� �����Դϴ�. ");
		else {
			add(v1, v2);
			add(v2, v1); 
		}
	}


	public void printAdjacentVertices(int v) {
		StringBuffer print = new StringBuffer("");

		if(v<0 || v>=n)
			print.append("���� ���� ���� - �߸��� ���� ��ȣ�Դϴ�.");
		else{
			Node temp = list[v];
			print.append(v + "�� ������ ���� : ");
			while (temp != null) {
				print.append(temp.vertex + " ");
				temp = temp.link;
			}
		}
		System.out.println(print);
	}

	private void dfs(int i) {
		dfsVisit[i] = true;
		System.out.print(i + " ");

		Node temp = list[i];
		while(temp != null) {
			if(dfsVisit[temp.vertex]== false)
				dfs(temp.vertex);
			temp = temp.link;
		}
	}

	public void depthFirstSearch() {
		for (int i = 0; i < n; i++)
			dfsVisit[i] = false;
		dfs(0);

		for (int i = 0; i < n; i++)
			if(!dfsVisit[i])
				System.out.print(i + " ");

		System.out.println();
	}

	private void bfs(int i) {
		Node temp = new Node();
		Queue<Integer> q = new <Integer> LinkedList();
		q.offer(i);
		bfsVisit[i] = true;
		System.out.print(i + " ");

		while(!q.isEmpty()){
			i = q.poll();
			for(temp = list[i]; temp != null; temp=temp.link) {
				if(bfsVisit[temp.vertex] == false) {
					bfsVisit[temp.vertex] = true;
					System.out.print(temp.vertex + " ");
					q.offer(temp.vertex);
				}
			}
		}
	}


	public void breadthFirstSearch() {
		for (int i = 0; i < n; i++)
			bfsVisit[i] = false;
		bfs(0);

		for (int i = 0; i < n; i++)
			if(!bfsVisit[i])
				System.out.print(i + " ");

		System.out.println();
	}


	private class Node {
		int vertex;
		Node link;

		Node() {
			this.vertex = 0;
			this.link = null;
		}
		Node(int vertex) {
			this.vertex = vertex;
			this.link = null;
		}
	}

}
