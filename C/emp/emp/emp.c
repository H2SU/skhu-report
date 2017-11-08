#include <stdio.h>

typedef struct  empolyee
{
	int id;
	char name[20];
	int age;
}E;

int main(void)
{
	E emp[5] = { {1,"홍길동",20},{2,"임꺽정",23}, {3,"김철수",27},{4,"김영희",30},{5,"김희수",21} };
	int minage=0;
	int maxage=0;
	int i = 0;
	int n = 0;
	
	while (1)
	{
		n = 0;

		printf("최저 나이를 입력해주세요: ");
		scanf("%d", &minage);

		printf("최고 나이를 입력해주세요: ");
		scanf("%d", &maxage);

		for (i = 0; i < 5; i++)
		{
			if (minage <= emp[i].age && emp[i].age <= maxage)
			{
				printf("%d: %s %d살\n", emp[i].id, emp[i].name, emp[i].age);
				n++;
			}
		}

		if (n == 0)
			printf("해당 사원은 없습니다.\n");
	}
	/*
	strcpy(emp[0].name, "홍길동");
	fputs(emp[0].name, stdout);
	*/

}