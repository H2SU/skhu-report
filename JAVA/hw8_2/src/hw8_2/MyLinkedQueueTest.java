/*
 * ����: int�� �ڷḦ �����ϴ� ť�� �����ڷᱸ���� �����ϰ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �ۼ���: �����
 * �ۼ���: 17.11.12.
 */
package hw8_2;

import java.util.Scanner;

public class MyLinkedQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedQueue queue = new MyLinkedQueue();
		int menu = 0;
		int item = 0;
		System.out.println("hw8_2: �����");
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("1:���� 2:���� 3:��ü���� 4:���� --->");
			menu = input.nextInt();
			switch(menu) {
			case 1:
				System.out.print("������ ���� �Է�:");
				input.nextLine();
				item = input.nextInt();
				queue.enQueue(item);
				break;
			case 2:
				System.out.println("������ ���� = " + queue.deQueue());
				break;
			case 3:
				while(!queue.isEmpty()) {
					System.out.println("������ ���� : " + queue.deQueue());
				}
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("1~4������ ������ �Է����ּ���.");
			}
		} while(menu != 4);
	}
}
