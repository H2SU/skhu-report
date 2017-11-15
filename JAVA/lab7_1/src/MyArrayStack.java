/*
 *  ����:���������� �迭�� ������ ���� ���� �߻��ڷ����� MyArrayStack�� �����ϰ� �̸� �̿��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *  �ۼ���: �����
 *  �ۼ���: 17.10.30.
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
			System.out.println("������ ���� á���ϴ�.");
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
