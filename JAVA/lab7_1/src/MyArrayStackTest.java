/*
 *  ����:���������� �迭�� ������ ���� ���� �߻��ڷ����� MyArrayStack�� �����ϰ� �̸� �̿��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *  �ۼ���: �����
 *  �ۼ���: 17.10.30.
 */
import java.util.Scanner;

public class MyArrayStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("lab7_1: �����");
		MyArrayStack mas = new MyArrayStack();
		int num = 0;
		int num2;
		
		while(true)
		{
			System.out.print("1:���� 2:���� 3:��ȸ 4:��ü���� 5:����\n-> ");
			num = input.nextInt();
			
			if(num==1) 
			{
				System.out.print("�������� �Է��ϼ���: ");
				num2 = input.nextInt();
				
				mas.push(num2);
			}
			
			else if(num==2)
			{
				System.out.println("pop: " + mas.pop());
			}
			
			else if(num==3)
			{
				System.out.println("peek: "+ mas.peek());
			}
			
			else if(num==4)
			{
				while(!mas.isEmpty())
				{
					System.out.println(mas.pop());
				}
			}
			
			else if(num==5)
			{
				break;
			}
			
			else
			{
				System.out.println("1~5������ ������ �Է��ϼ���.");
			}
		}
		
	}

}
