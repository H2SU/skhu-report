package hw11_1;

/*
 * ����: ���� ���� �˰����� �̿��Ͽ� �л����� ���� �������� �������� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �ۼ���: 2017.12.14
 * �ۼ���: �����
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
		System.out.println("hw11_1 : �����");

		Scanner input = new Scanner(System.in);
		System.out.print("�л��� : ");
		int n = input.nextInt();

		Student[] arr = new Student[n];

		for (int i = 0 ; i < n; i++) {
			System.out.print("�й� : ");
			int snum = input.nextInt();
			System.out.print("���� : ");
			int age = input.nextInt();
			arr[i] = new Student(snum, age);
		}

		System.out.println();
		System.out.println(Arrays.toString(arr));

		insertionSort(arr);

		System.out.println();
		System.out.println("�������� ����");
		System.out.println(Arrays.toString(arr));
	}

}
