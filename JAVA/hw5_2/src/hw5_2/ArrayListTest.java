//***************************
// ���ϸ�: MyListTest.java
// �ۼ���: �����
// �ۼ���: 17.09.19
// ����: �����ڷᱸ�� ������ �����Ѵ�.
//***************************
package hw5_2;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("hw5_2:�����");
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(-999);
		list.add(50);
		list.add(90);
		list.add(10);

		System.out.println(list);

		System.out.println(list.size());

		int index;
		System.out.print("��ȸ�� �ε��� �Է�: ");
		index = input.nextInt();

		System.out.print("�ε��� "+index+"�� ���� = ");
		System.out.println(list.get(index));

		System.out.print("777�� ������ �ε��� �Է�: ");
		index = input.nextInt();
		list.remove(index);
		list.add(index, 777);
		System.out.println(list);

		System.out.print("999�� ������ �ε��� �Է�: ");
		index = input.nextInt();
		list.add(index, 999);
		System.out.println(list);

		System.out.print("������ �ε��� �Է�: ");
		index = input.nextInt();
		System.out.print("�ε��� "+index+"�� ���� = ");
		list.remove(index);
		
		System.out.println(list.get(index));
		System.out.println(list);
		
		for(int i=1; i<=25; i++)
		{
			list.add(i);
		}
		System.out.println(list);
	}
}
