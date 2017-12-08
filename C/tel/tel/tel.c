#include <stdio.h>
#include <stdlib.h>

typedef struct TEL {
	char name[10];
	int num;
}TEL;

TEL* read_tel(void)
{
	FILE * fp;
	fp = fopen("tel.dat", "r");
	int i = 0;
	
	TEL * telptr = (TEL*)malloc(20 * sizeof(TEL));
	if (fp == NULL) {
		printf("동적할당실패\n");
	}

	while (1)
	{
		if (feof(fp))
			break;
		else
		{
			fscanf_s(fp, "%s %d", telptr[i].name, &telptr[i].num);
			i++;
		}

		fclose(fp);

		return telptr;
	}
}

int main(void)
{
	int i = 0;
	TEL * tel_arr = read_tel();

	for (i = 0; i < 10; i++)
	{
		printf("%s / %d \n", tel_arr[i].name, tel_arr[i].num);
	}

	free(tel_arr);

	return 0;
}

