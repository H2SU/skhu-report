/*
�ۼ��� : �����	
�ۼ��� : 2017.09.22
���� : �� ������ ����� ���� ���� �ڹٲٴ� �Լ��� �����غ���
*/

#include<stdio.h>

void swap3(int *n1, int* n2, int* n3)
{

	int temp = *n1; 
	*n1 = *n2, *n2 = *n3, *n3 = temp;

}

int main()
{
	int n1, n2, n3;

	printf("���� ������ �Է����ּ���: ");
	scanf_s("%d %d %d", &n1, &n2, &n3);

	swap3(&n1, &n2, &n3);
	printf("%d, %d, %d\n", n1, n2, n3);

	return 0;

}