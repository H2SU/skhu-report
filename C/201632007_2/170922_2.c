/*
���� : ���� num�� ����� ���� ������ ����ϴ� �Լ��� �����ϰ� �̸� ȣ���ϴ� main�Լ��� �ۼ��غ���
��, ���⼭�� ���� �ΰ��� ���·� �Լ��� �����ؾ���
�ۼ��� : �����
�ۼ��� : 2017.09.22
*/

#include<stdio.h>

int SquareByValue(int n)
{
	return n*n;
}
void SquareByReference(int *p)
{
	*p = *p * *p;
}

int main()
{
	int n;

	printf("������ �Է��ϼ���: ");
	scanf_s("%d", &n);

	printf("Call by Value : %d \n", SquareByValue(n));
	printf("n : %d \n", n);

	SquareByReference(&n);
	printf("Call by Reference : %d \n", n);
	printf("n : %d \n", n);

	return 0;

}