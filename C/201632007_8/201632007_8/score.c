#include <stdio.h>

typedef struct {
	int id;
	char name[20];
	int eng_score;
	int math_score;
}score;

void outputScore(score * arr)
{
	printf("�й�: %d \n�̸�: %s \n��������: %d \n��������: %d \n",arr->id,arr->name,arr->eng_score,arr->math_score);
}

double averageScore(score * arr, double * tot)
{
	
}

int main(void)
{
	score score[5] = { {1,"ȫ�浿",50,60},{2,"��ö��",75,70},{3,"�迵��",30,60},{4,"���缮",80,90},{5,"��ȣ��",80,80} };
	double total[2];

	outputScore(&score[0]);
	outputScore(&score[1]);
	outputScore(&score[2]);
	outputScore(&score[3]);
	outputScore(&score[4]);

}