package hw11_1;
/*
 * 문제: 학생 클래스
 * 작성일: 2017.12.14
 * 작성자: 김희수
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
		return String.format("학번 : %d / 나이 : %d ", snum, age);
	}

	public int getAge() 
	{
		return age;
	}
}
