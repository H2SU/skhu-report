/*
 *  ����: java.util ��Ű���� Stack Ŭ������ �̿��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *  �ۼ���: �����
 *  �ۼ���: 17.10.30.
 */
import java.util.Scanner;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("lab7_3 : �����");
		Stack<Integer> stack = new Stack<Integer>();

		int num = 0;
		int num2 = 0;

		while(true)
		{
			System.out.print("1:���� 2:���� 3:��ȸ 4:��ü���� 5:����\n-> ");
			num = input.nextInt();

			if(num==1) 
			{
				System.out.print("�������� �Է��ϼ���: ");
				num2 = input.nextInt();

				stack.push(num2);
			}

			else if(num==2)
				System.out.println("pop: " + stack.pop());

			else if(num==3)
				System.out.println("peek: "+ stack.peek());

			else if(num==4)
			{
				while(!stack.isEmpty())
				{
					System.out.println(stack.pop());
				}
			}

			else if(num==5)
				break;

			else
				System.out.println("1~5������ ������ �Է��ϼ���.");
		}

	}
}