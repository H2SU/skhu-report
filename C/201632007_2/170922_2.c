/*
주제 : 변수 num에 저장된 값의 제곱을 계산하는 함수를 정의하고 이를 호출하는 main함수를 작성해보자
단, 여기서는 다음 두가지 형태로 함수를 정의해야함
작성자 : 김희수
작성일 : 2017.09.22
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

	printf("정수를 입력하세요: ");
	scanf_s("%d", &n);

	printf("Call by Value : %d \n", SquareByValue(n));
	printf("n : %d \n", n);

	SquareByReference(&n);
	printf("Call by Reference : %d \n", n);
	printf("n : %d \n", n);

	return 0;

}