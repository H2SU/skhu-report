/*
 *  문제: 내부적으로 연결 자료구조로 구현한 정수 스택 추상자료형인 MyLinkedStack을 정의하고 이를 이용하는 프로그램을 작성하시오.
 *  작성자: 김희수
 *  작성일: 17.10.30.
 */
import java.util.Scanner;

public class MyLinkedStackTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("lab7_2: 김희수");
		MyLinkedStack mls = new MyLinkedStack();
		int num = 0;
		int num2;
		
		while(true)
		{
			System.out.print("1:삽입 2:삭제 3:조회 4:전체삭제 5:종료\n-> ");
			num = input.nextInt();
			
			if(num==1) 
			{
				System.out.print("정수값을 입력하세요: ");
				num2 = input.nextInt();
				
				mls.push(num2);
			}
			
			else if(num==2)
			{
				System.out.println("pop: " + mls.pop());
			}
			
			else if(num==3)
			{
				System.out.println("peek: "+ mls.peek());
			}
			
			else if(num==4)
			{
				while(!mls.isEmpty())
				{
					System.out.println(mls.pop());
				}
			}
			
			else if(num==5)
			{
				break;
			}
			
			else
			{
				System.out.println("1~5사이의 정수를 입력하세요.");
			}
		}
		
	}
}
