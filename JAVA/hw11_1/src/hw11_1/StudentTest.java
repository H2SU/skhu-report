package hw11_1;

/*
 * 문제: 삽입 정렬 알고리즘을 이용하여 학생들을 나이 기준으로 오름차순 정렬하는 프로그램을 작성하시오.
 * 작성일: 2017.12.14
 * 작성자: 김희수
 */

import java.util.Arrays;
import java.util.Scanner;

public class StudentTest {

	public static void insertionSort(Student[] a) {
		int loca;
		Student item;

		for (int i = 1 ; i < a.length ;  i++) {
			item = a[i];
			for(loca = i ; (loca > 0) && (a[loca-1].getAge()>item.getAge()) ; loca--) {
				a[loca] = a[loca-1];
			}
			a[loca] = item;
		}
	}

	public static void main(String[] args) {
		System.out.println("hw11_1 : 김희수");

		Scanner input = new Scanner(System.in);
		System.out.print("학생수 : ");
		int n = input.nextInt();

		Student[] arr = new Student[n];

		for (int i = 0 ; i < n; i++) {
			System.out.print("학번 : ");
			int snum = input.nextInt();
			System.out.print("나이 : ");
			int age = input.nextInt();
			arr[i] = new Student(snum, age);
		}

		System.out.println();
		System.out.println(Arrays.toString(arr));

		insertionSort(arr);

		System.out.println();
		System.out.println("삽입정렬 수행");
		System.out.println(Arrays.toString(arr));
	}

}
