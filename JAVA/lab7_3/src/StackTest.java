/*
 *  문제: java.util 패키지의 Stack 클래스를 이용하는 프로그램을 작성하시오.
 *  작성자: 김희수
 *  작성일: 17.10.30.
 */
import java.util.Scanner;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("lab7_3 : 김희수");
		Stack<Integer> stack = new Stack<Integer>();

		int num = 0;
		int num2 = 0;

		while(true)
		{
			System.out.print("1:삽입 2:삭제 3:조회 4:전체삭제 5:종료\n-> ");
			num = input.nextInt();

			if(num==1) 
			{
				System.out.print("정수값을 입력하세요: ");
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
				System.out.println("1~5사이의 정수를 입력하세요.");
		}

	}
}