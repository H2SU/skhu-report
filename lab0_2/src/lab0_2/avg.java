package lab0_2;

import java.util.Scanner;

public class avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double[] arr = new double[10];
		double sum = 0;
		double avg = 0;
		
		System.out.println("lab0_2: 김희수");
		System.out.print("10개의 정수를 입력하세요.");
		
		for(int i = 0; i<10; i++)
		{
			arr[i] = input.nextDouble();
			sum += arr[i];
		}
		
		avg = sum/10;
		System.out.println("평균: " + avg);
		System.out.print("평균 이상인 값: ");
		
		for(int i=0; i<10; i++)
		{
			if(avg<arr[i])
				System.out.print((int)arr[i]+ " ");
		}
		////////////////////////////////////////////////
	}
	///////////////////////////////////////////////////
}
