#include <stdio.h>

typedef struct  empolyee
{
	int id;
	char name[20];
	int age;
}E;

int main(void)
{
	E emp[5] = { {1,"ȫ�浿",20},{2,"�Ӳ���",23}, {3,"��ö��",27},{4,"�迵��",30},{5,"�����",21} };
	int minage=0;
	int maxage=0;
	int i = 0;
	int n = 0;
	
	while (1)
	{
		n = 0;

		printf("���� ���̸� �Է����ּ���: ");
		scanf("%d", &minage);

		printf("�ְ� ���̸� �Է����ּ���: ");
		scanf("%d", &maxage);

		for (i = 0; i < 5; i++)
		{
			if (minage <= emp[i].age && emp[i].age <= maxage)
			{
				printf("%d: %s %d��\n", emp[i].id, emp[i].name, emp[i].age);
				n++;
			}
		}

		if (n == 0)
			printf("�ش� ����� �����ϴ�.\n");
	}
	/*
	strcpy(emp[0].name, "ȫ�浿");
	fputs(emp[0].name, stdout);
	*/

}