#include <stdio.h>

int main(void)
{
	char * a;
	int i = 0;
	a = "abcdefghijklmnopqrstuvwxyz";

	while (1) {
		printf("%c", a[i]);
		i++;

		if (a[i] == NULL)
			break;
	}

	system("pause");

	return 0;
}