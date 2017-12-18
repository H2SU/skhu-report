package hw10_3;

/*
 * 파일명: ListGraphTest.java
 * 작성일: 2017.12.08
 * 작성자: 김희수ㅒ
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ListGraphTest {

	public static void main(String[] args) {
		System.out.println("hw10_3 : 김희수");

		Scanner input = new Scanner(System.in);
		System.out.print("정점 수 입력: ");
		int n = input.nextInt();

		ListGraph graph = new ListGraph(n);

		System.out.println("메뉴 번호를 입력하세요.");
		int menu = 0;
		int item = 0;
		int v1 = 0;
		int v2 = 0;

		do {
			System.out.print("1:간선삽입 2:인접정점출력 3:DFS 4:BFS 5:종료 --->");
			menu = input.nextInt();
			switch(menu) {
			case 1:
				System.out.print("정점 v1 입력: ");
				v1 = input.nextInt();
				System.out.print("정점 v2 입력: ");
				v2 = input.nextInt();
				graph.addEdge(v1, v2);
				break;
			case 2:
				System.out.print("정점 입력:");
				v1 = input.nextInt();
				graph.printAdjacentVertices(v1);
				break;
			case 3:
				System.out.println("깊이우선탐색 순서대로 정점을 출력합니다.");
				graph.depthFirstSearch();
				break;
			case 4:
				System.out.println("너비우선탐색 순서대로 정점을 출력합니다.");
				graph.breadthFirstSearch();
				break;
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
			System.out.println("간선 삽입 오류 - 잘못된 정점 번호입니다.");
		else if (find(v1, v2))
			System.out.println("간선 삽입 오류 - 이미 존재하는 간선입니다. ");
		else {
			add(v1, v2);
			add(v2, v1); 
		}
	}


	public void printAdjacentVertices(int v) {
		StringBuffer print = new StringBuffer("");

		if(v<0 || v>=n)
			print.append("인접 삽입 오류 - 잘못된 정점 번호입니다.");
		else{
			Node temp = list[v];
			print.append(v + "에 인접한 정점 : ");
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
