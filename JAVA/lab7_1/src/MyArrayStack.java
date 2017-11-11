/*
 *  문제:내부적으로 배열로 구현한 정수 스택 추상자료형인 MyArrayStack을 정의하고 이를 이용하는 프로그램을 작성하시오.
 *  작성자: 김희수
 *  작성일: 17.10.30.
 */

public class MyArrayStack {
	private int[] stack = new int[10];
	private int top=-1;
	int tmp = 0;
	
	public boolean isFull()
	{
		if(top==stack.length-1)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	
	public void push(int n)
	{
		if(isFull())
			System.out.println("스택이 가득 찼습니다.");
		else 
			stack[++top] = n;
	}
	
	public int pop()
	{
		try{
			tmp = stack[top];
			stack[top--] = 0;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

		return tmp;
	}
	
	public int peek()
	{
		try {
			tmp = stack[top];
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

		return tmp;
	}
}
