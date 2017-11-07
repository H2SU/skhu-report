//***************************
// 파일명: MyListTest.java
// 작성자: 김희수
// 작성일: 17.09.19
// 설명: 순차자료구조 구현을 연습한다.
//***************************
package hw5_2;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("hw5_2:김희수");
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(-999);
		list.add(50);
		list.add(90);
		list.add(10);

		System.out.println(list);

		System.out.println(list.size());

		int index;
		System.out.print("조회할 인덱스 입력: ");
		index = input.nextInt();

		System.out.print("인덱스 "+index+"의 원소 = ");
		System.out.println(list.get(index));

		System.out.print("777로 갱신할 인덱스 입력: ");
		index = input.nextInt();
		list.remove(index);
		list.add(index, 777);
		System.out.println(list);

		System.out.print("999로 갱신할 인덱스 입력: ");
		index = input.nextInt();
		list.add(index, 999);
		System.out.println(list);

		System.out.print("삭제할 인덱스 입력: ");
		index = input.nextInt();
		System.out.print("인덱스 "+index+"의 원소 = ");
		list.remove(index);
		
		System.out.println(list.get(index));
		System.out.println(list);
		
		for(int i=1; i<=25; i++)
		{
			list.add(i);
		}
		System.out.println(list);
	}
}
