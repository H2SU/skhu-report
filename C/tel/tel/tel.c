#include <stdio.h>
#include <stdlib.h>

typedef struct{
	char name[20];
	int num;
}TEL;

TEL ** read_tel()
{
	int i = 0;
	FILE * fp = fopen("tel.dat", "rt");
	TEL ** telptr;

	while (1)
	{
		if (feof(fp))
			break;
		else
		{
			telptr[i] = (TEL**)malloc(10 * sizeof(TEL));
			fscanf(fp, "%s %d", telptr[i]->name, &telptr[i]->num);
			i++;
		}

		fclose(fp);
		return telptr;
	}
}

int main(void)
{
	int i = 0;
	TEL ** tel_arr = read_tel();

	for (i = 0; i < 10; i++)
	{
		printf("%s / %d \n", tel_arr[i]->name, tel_arr[i]->num);
	}

	free(tel_arr);

	return 0;
}

