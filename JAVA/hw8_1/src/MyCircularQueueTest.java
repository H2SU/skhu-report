/*
 * ����: int�� �ڷḦ �����ϴ� ť�� ���� ť�� �����ϰ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �ۼ���: �����
 * �ۼ���: 17.11.10
 */
import java.util.Scanner;

public class MyCircularQueueTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyCircularQueue queue = new MyCircularQueue(5);
		int menu = 0;
		int item = 0;
		System.out.println("hw8_1 : �����");
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
				System.out.println("����");
				break;
			default:
				System.out.println("1~4������ ������ �Է��ϼ���.");
			}
		} while(menu != 4);
	}
}
