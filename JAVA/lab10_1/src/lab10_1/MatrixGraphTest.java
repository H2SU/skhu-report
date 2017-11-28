package lab10_1;

/* 
 * ����: ������ �׷����� �����ϰ� ������ �����ϴ� ���α׷� 
 * ���ϸ�: MatrixGraphTest.java
 * �ۼ���: 2017.11.23
 * �ۼ���: 201632007 �����
 */

import java.util.Scanner;

public class MatrixGraphTest { 
	public static void main(String[] args) { 
		System.out.println("lab10_1 : �����");

		// ���� �� n �Է�
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �� �Է�: ");
		int n = scan.nextInt();

		// ���� ���� n�� ������ �׷����� ����
		MatrixGraph graph = new MatrixGraph(n);

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

class MatrixGraph {
	private int[][] mtx;
	private int n;
	public MatrixGraph(int n) {
		mtx = new int[n][n];
		this.n = n;
	}

	public void addEdge(int v1, int v2) {
		if(v1 < 0 || v1 >= n || v2 < 0 || v2 >= n) {
			System.out.println("���� ���� ���� : �߸��� ���� ��ȣ�Դϴ�.");
		}
		else if(mtx[v1][v2] != 0) {
			System.out.println("���� ���� ���� : �̹� �����ϴ� �����Դϴ�.");
		}
		else {
			mtx[v1][v2] = 1;
			mtx[v2][v1] = 1;
			System.out.printf("���� �Ϸ�.");
		}
	}

	public void printAdjacentVertices(int v1) {
		if(v1 < 0 || v1 >= n)
			System.out.println("���� ���� ���� : �߸��� ���� ��ȣ�Դϴ�.");
		else {
			for(int i = 0; i < n; i++) {
				if(mtx[v1][i] != 0)
					System.out.println(i + " ");
			}
		}
	}
}
