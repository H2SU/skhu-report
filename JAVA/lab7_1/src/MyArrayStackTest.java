/*
 *  문제:내부적으로 배열로 구현한 정수 스택 추상자료형인 MyArrayStack을 정의하고 이를 이용하는 프로그램을 작성하시오.
 *  작성자: 김희수
 *  작성일: 17.10.30.
 */
import java.util.Scanner;

public class MyArrayStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("lab7_1: 김희수");
		MyArrayStack mas = new MyArrayStack();
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
				System.out.println("1~5사이의 정수를 입력하세요.");
			}
		}
		
	}

}
