package hw11_1;
/*
 * ����: �л� Ŭ����
 * �ۼ���: 2017.12.14
 * �ۼ���: �����
 */

public class Student 
{
	private int snum;
	private int age;

	public Student(int num, int age) 
	{
		this.snum = num;
		this.age = age;
	}

	@Override
	public String toString() 
	{
		return String.format("�й� : %d / ���� : %d ", snum, age);
	}

	public int getAge() 
	{
		return age;
	}
}
