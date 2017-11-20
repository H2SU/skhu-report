/*
작성자: 김희수
작성일: 17.11.20
*/
#include <stdio.h>

typedef struct {
	int id;
	char name[20];
	int eng_score;
	int math_score;
}score;

void outputScore(score * arr)
{
	printf("학번: %d \n이름: %s \n영어점수: %d \n수학점수: %d \n",arr->id,arr->name,arr->eng_score,arr->math_score);
}

double averageScore(score * arr, double * tot)
{
	int i;
	double sum = 0;
	double sum1 = 0;

	for (i = 0; i < 5; i++)
	{
		sum += arr[i].eng_score;
		sum1 += arr[i].math_score;
	}

	tot[0] = sum / 5;
	tot[1] = sum1 / 5;
}

int main(void)
{
	score score[5] = { {1,"홍길동",50,65},{2,"김철수",75,75},{3,"김영희",30,65},{4,"유재석",80,95},{5,"강호동",80,80} };
	double total[2];

	outputScore(&score[0]);
	outputScore(&score[1]);
	outputScore(&score[2]);
	outputScore(&score[3]);
	outputScore(&score[4]);

	averageScore(score, total);
	printf("========================\n");
	printf("영어평균: %.f \n수학평균: %.f\n", total[0], total[1]);

	return 0;
}