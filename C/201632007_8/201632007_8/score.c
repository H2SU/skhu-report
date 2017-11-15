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
	
}

int main(void)
{
	score score[5] = { {1,"홍길동",50,60},{2,"김철수",75,70},{3,"김영희",30,60},{4,"유재석",80,90},{5,"강호동",80,80} };
	double total[2];

	outputScore(&score[0]);
	outputScore(&score[1]);
	outputScore(&score[2]);
	outputScore(&score[3]);
	outputScore(&score[4]);

}