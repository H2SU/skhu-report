/*
 * 문제: int형 자료를 저장하는 큐를 연결자료구조로 구현하고 사용하는 프로그램을 작성하시오.
 * 작성자: 김희수
 * 작성일: 17.11.12.
 */
package hw8_2;

import java.util.Scanner;

public class MyLinkedQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedQueue queue = new MyLinkedQueue();
		int menu = 0;
		int item = 0;
		System.out.println("hw8_2: 김희수");
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("1:삽입 2:삭제 3:전체삭제 4:종료 --->");
			menu = input.nextInt();
			switch(menu) {
			case 1:
				System.out.print("삽입할 원소 입력:");
				input.nextLine();
				item = input.nextInt();
				queue.enQueue(item);
				break;
			case 2:
				System.out.println("삭제한 원소 = " + queue.deQueue());
				break;
			case 3:
				while(!queue.isEmpty()) {
					System.out.println("삭제한 원소 : " + queue.deQueue());
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("1~4사이의 정수를 입력해주세요.");
			}
		} while(menu != 4);
	}
}
