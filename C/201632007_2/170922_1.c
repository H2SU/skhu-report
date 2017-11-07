/*
작성자 : 김희수	
작성일 : 2017.09.22
주제 : 세 변수에 저장되 값을 서로 뒤바꾸는 함수를 정의해보자
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

	printf("정수 세개를 입력해주세요: ");
	scanf_s("%d %d %d", &n1, &n2, &n3);

	swap3(&n1, &n2, &n3);
	printf("%d, %d, %d\n", n1, n2, n3);

	return 0;

}