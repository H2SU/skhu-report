package hw10_1;

/* 
 * 파일명: ListGraphTest.java
 * 작성일: 2017.11.30.
 * 작성자: 김희수
 * 설명: 무방향 그래프를 생성하고 연산을 수행하는 프로그램 
 */

import java.util.Scanner;

public class ListGraphTest { 
	public static void main(String[] args) { 
		System.out.println("hw10_1 : 김희수");

		// 정점 수 n 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("정점 수 입력: ");
		int n = scan.nextInt();

		// 정점 수가 n인 무방향 그래프를 생성
		ListGraph graph = new ListGraph(n);

		System.out.println("\n메뉴 번호를 입력하세요.");
		int menu = 0;
		int item = 0;
		int v1 = 0;
		int v2 = 0;

		// 종료를 선택할 때까지 반복하여 메뉴를 제공하고 그에 맞는 그래프 연산을 수행
		do {
			System.out.print("\n1:간선삽입 2:인접정점출력 3:DFS 4:BFS 5:종료 --->");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.print("정점 v1 입력: ");
				v1 = scan.nextInt();		
				System.out.print("정점 v2 입력: ");
				v2 = scan.nextInt();
				graph.addEdge(v1, v2);
				break;
			case 2:
				System.out.print("정점 입력:");		 
				v1 = scan.nextInt();  
				graph.printAdjacentVertices(v1);
				break;				
				//			case 3:
				//				System.out.println("깊이우선탐색 순서대로 정점을 출력합니다.");
				//				graph.depthFirstSearch();
				//				break;
				//			case 4:
				//				System.out.println("너비우선탐색 순서대로 정점을 출력합니다.");
				//				graph.breadthFirstSearch();
				//				break;
			case 5:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("메뉴 번호 오류 - 메뉴를 다시 선택하세요.");
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
			System.out.println("간선 삽입 오류 - 잘못된 정점 번호입니다.");
		}
		else if(list[v1] != null && list[v2] != null 
				&& list[v1].vertex == v2
				&& list[v2].vertex == v1) {
			System.out.println("간선 삽입 오류 - 이미 존재합니다.");
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
			System.out.printf("삽입 완료.");
		}
	}

	public void printAdjacentVertices(int v1) {
		if(v1 < 0 || v1 >= n)
			System.out.println("인접 정점 오류 - 잘못된 정점 번호입니다.");
		else {
			System.out.print("정점" + v1 + "의 인접리스트");
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
