/*
�ۼ���: �����
�ۼ���: 17.11.20
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
	printf("�й�: %d \n�̸�: %s \n��������: %d \n��������: %d \n",arr->id,arr->name,arr->eng_score,arr->math_score);
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
	score score[5] = { {1,"ȫ�浿",50,65},{2,"��ö��",75,75},{3,"�迵��",30,65},{4,"���缮",80,95},{5,"��ȣ��",80,80} };
	double total[2];

	outputScore(&score[0]);
	outputScore(&score[1]);
	outputScore(&score[2]);
	outputScore(&score[3]);
	outputScore(&score[4]);

	averageScore(score, total);
	printf("========================\n");
	printf("�������: %.f \n�������: %.f\n", total[0], total[1]);

	return 0;
}