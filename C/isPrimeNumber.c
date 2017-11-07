#include <stdio.h>
	
int main()
{

	int prime, i, j;

	printf("소수: 1");

	for (prime = 2; prime <= 100; prime++)
	{
		j = 0;

		for (i = 2; i < prime / 2; i++)
		{
			if (prime%i == 0)
				j++;
		}

		if (j == 0)
			printf(", %d", prime);
	}

	printf("\n");

	return 0;
}
