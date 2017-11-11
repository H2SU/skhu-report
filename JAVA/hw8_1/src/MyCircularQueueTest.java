/*
 * 문제: int형 자료를 저장하는 큐를 원형 큐로 구현하고 사용하는 프로그램을 작성하시오.
 * 작성자: 김희수
 * 작성일: 17.11.10
 */
import java.util.Scanner;

public class MyCircularQueueTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyCircularQueue queue = new MyCircularQueue(5);
		int menu = 0;
		int item = 0;
		System.out.println("hw8_1 : 김희수");
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
				System.out.println("종료");
				break;
			default:
				System.out.println("1~4까지의 정수를 입력하세요.");
			}
		} while(menu != 4);
	}
}
