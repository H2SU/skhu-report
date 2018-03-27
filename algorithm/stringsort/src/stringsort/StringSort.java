package stringsort;

import java.util.Arrays;

public class StringSort {

	static void stringSort(String[] str) 
	{
		String temp;
		
		for(int i=0; i<str.length; i++) 
		{
			for(int j=1; j<str.length; j++)
			{
				if(str[j-1].compareTo(str[j])>0) 
				{
					temp=str[j];
					str[j]=str[j-1];
					str[j-1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"eee", "ccc", "aaa", "bbb", "ddd"};
		stringSort(str);
		System.out.println(Arrays.toString(str));
	}

}
