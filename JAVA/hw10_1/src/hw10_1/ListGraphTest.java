package hw10_1;

/* 
 * ���ϸ�: ListGraphTest.java
 * �ۼ���: 2017.11.30.
 * �ۼ���: �����
 * ����: ������ �׷����� �����ϰ� ������ �����ϴ� ���α׷� 
 */

import java.util.Scanner;

public class ListGraphTest { 
	public static void main(String[] args) { 
		System.out.println("hw10_1 : �����");

		// ���� �� n �Է�
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �� �Է�: ");
		int n = scan.nextInt();

		// ���� ���� n�� ������ �׷����� ����
		ListGraph graph = new ListGraph(n);

		System.out.println("\n�޴� ��ȣ�� �Է��ϼ���.");
		int menu = 0;
		int item = 0;
		int v1 = 0;
		int v2 = 0;

		// ���Ḧ ������ ������ �ݺ��Ͽ� �޴��� �����ϰ� �׿� �´� �׷��� ������ ����
		do {
			System.out.print("\n1:�������� 2:����������� 3:DFS 4:BFS 5:���� --->");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.print("���� v1 �Է�: ");
				v1 = scan.nextInt();		
				System.out.print("���� v2 �Է�: ");
				v2 = scan.nextInt();
				graph.addEdge(v1, v2);
				break;
			case 2:
				System.out.print("���� �Է�:");		 
				v1 = scan.nextInt();  
				graph.printAdjacentVertices(v1);
				break;				
				//			case 3:
				//				System.out.println("���̿켱Ž�� ������� ������ ����մϴ�.");
				//				graph.depthFirstSearch();
				//				break;
				//			case 4:
				//				System.out.println("�ʺ�켱Ž�� ������� ������ ����մϴ�.");
				//				graph.breadthFirstSearch();
				//				break;
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

	public ListGraph(int n) {
		list = new Node[n];
		this.n = n;
	}

	public void addEdge(int v1, int v2) {
		if(v1 < 0 || v1 >= n || v2 < 0 || v2 >= n) {
			System.out.println("���� ���� ���� - �߸��� ���� ��ȣ�Դϴ�.");
		}
		else if(list[v1] != null && list[v2] != null 
				&& list[v1].vertex == v2
				&& list[v2].vertex == v1) {
			System.out.println("���� ���� ���� - �̹� �����մϴ�.");
		}
		else {
			Node n1 = new Node();

			n1.vertex = v2;
			n1.link = list[v1];
			list[v1] = n1;

			Node n2 = new Node();

			n2.vertex = v1;
			n2.link = list[v2];
			list[v2] = n2;
			System.out.printf("���� �Ϸ�.");
		}
	}

	public void printAdjacentVertices(int v1) {
		if(v1 < 0 || v1 >= n)
			System.out.println("���� ���� ���� - �߸��� ���� ��ȣ�Դϴ�.");
		else {
			System.out.print("����" + v1 + "�� ��������Ʈ");
			for(Node tmp = list[v1]; tmp != null; tmp = tmp.link) {
				System.out.print("->" + tmp.vertex);
			}
			System.out.println();
		}
	}

	private class Node{
		int vertex;
		Node link;
	}
}
