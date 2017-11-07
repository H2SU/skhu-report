#include <stdio.h>

void MaxAndMin(int ** maxdptr, int ** mindptr, int * arr)
{
	*maxdptr = arr;
	*mindptr = arr;
	int i;

	for (i = 0; i < 5; i++)
	{
		if (**maxdptr < arr[i])
			*maxdptr = &arr[i];
		if (**mindptr > arr[i])
			*mindptr = &arr[i];
	}

}

int main(void)
{
	int arr[5] = { 3,6,9,12,15 };
	int * maxPtr;
	int * minPtr;

	MaxAndMin(&maxPtr, &minPtr, arr);

	printf("maxPtr = %d\nminPtr = %d\n", *maxPtr, *minPtr);

	return 0;
}