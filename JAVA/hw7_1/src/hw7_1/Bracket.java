package hw7_1;
import java.util.Scanner;
import java.util.Stack;

public class Bracket 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("hw7_1: �����");
		Scanner input = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		boolean isCorrectBracket = true;
		
		System.out.print("��ȣ�� �Է�: ");
		String a = input.nextLine();
		
		
		for(int i=0; i<a.length(); i++)
		{
			char c = a.charAt(i);
			if(c == '(' || c == '{' || c == '[' || c == '<')
			{
				stack.push(c);
			}
			
			else if(c == ')' || c == '}' || c == ']' || c == '>')
			{
				if(c == ')')
				{
					if(stack.peek() == '(')
						stack.pop();
					else if(stack.peek() != '(')
					{
						isCorrectBracket = false;
						break;
					}
						
				}
				
				else if(c == '}')
				{
					if(stack.peek() == '{')
						stack.pop();
					else if(stack.peek() != '{')
					{
						isCorrectBracket = false;
						break;
					}
						
				}
				
				else if(c == ']')
				{
					if(stack.peek() == '[')
						stack.pop();
					else if(stack.peek() != '[')
					{
						isCorrectBracket = false;
						break;
					}
						
				}
				
				else if(c == '>')
				{
					if(stack.peek() == '<')
						stack.pop();
					else if(stack.peek() != '<')
					{
						isCorrectBracket = false;
						break;
					}
						
				}
			}
		}
		
		if(isCorrectBracket)
			System.out.println("�ùٸ� ��ȣ���Դϴ�.");
		else if(!isCorrectBracket)
			System.out.println("�߸��� ��ȣ���Դϴ�.");
		
	}

}