package lab0_2;

import java.util.Scanner;

public class avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double[] arr = new double[10];
		double sum = 0;
		double avg = 0;
		
		System.out.println("lab0_2: �����");
		System.out.print("10���� ������ �Է��ϼ���.");
		
		for(int i = 0; i<10; i++)
		{
			arr[i] = input.nextDouble();
			sum += arr[i];
		}
		
		avg = sum/10;
		System.out.println("���: " + avg);
		System.out.print("��� �̻��� ��: ");
		
		for(int i=0; i<10; i++)
		{
			if(avg<arr[i])
				System.out.print((int)arr[i]+ " ");
		}
		////////////////////////////////////////////////
	}
	///////////////////////////////////////////////////
}
