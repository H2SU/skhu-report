//***************************
// ���ϸ�: MyListTest.java
// �ۼ���: �����
// �ۼ���: 17.09.19
// ����: �����ڷᱸ�� ������ �����Ѵ�.
//***************************
package hw5_1;

import java.util.Scanner;

public class MyListTest{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("hw5_1:�����");

		MyList list = new MyList();

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

class MyList
{

	private int[] arr;
	private int space;
	private int count;


	public MyList() 
	{
		this.arr = new int[10];
		this.space = 10;
		this.count = 0;
	}

	public void add(int num)
	{
		if(count==space)
		{
			System.out.print("�뷮 ���� "+space+"-->");
			space = space*2;
			System.out.println(space);
			
			int[] arr2 = new int[space];
			for(int i=0; i<count; i++) // i = 0~9
			{
				arr2[i] = arr[i];
			}
			
			arr = arr2;
		
		}
		
		arr[count] = num;
		count++;
	
	}

	public void add(int index, int num) throws ArrayIndexOutOfBoundsException
	{
		if(index<0 || index>count-1)
			throw new ArrayIndexOutOfBoundsException();
		
		for(int i = count; i>index; i--)
		{
			arr[i] = arr[i-1];
		}

		arr[index]=num;
		
		count++;
	
	}

	public void print()
	{
		System.out.print("[");

		for(int i=0; i<count; i++)
		{
			if(i<count-1)
				System.out.print(arr[i]+", ");
			else
				System.out.print(arr[i]);
		}

		System.out.println("]");
	}

	public int get(int index) throws ArrayIndexOutOfBoundsException
	{
		if(index<0 || index>count-1)
			throw new ArrayIndexOutOfBoundsException();
		return arr[index];
		
	}

	public void set(int index, int num) throws ArrayIndexOutOfBoundsException
	{
		if(index<0 || index>count-1)
			throw new ArrayIndexOutOfBoundsException();
		this.arr[index] = num;
	}

	public int size()
	{
		return count;
	}

	public int remove(int index) throws ArrayIndexOutOfBoundsException
	{
		if(index<0 || index>count-1)
			throw new ArrayIndexOutOfBoundsException();
		
		int result = arr[index];

		for(int i = index; i<count; i++)
		{
			arr[i] = arr[i+1];
		}

		count--;

		return result;

	}

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer("[");
		for(int i=0; i<count-1; i++) {
			str.append(arr[i]+", ");
		}
		str.append(arr[count-1]+"]");
		
		return str.toString(); 
	}

}
