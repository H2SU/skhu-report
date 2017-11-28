package e2017.exam2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		String[] a1 = { "d", "a", "b", "a", "c", "a" };
		String[] a2 = { "b", "a", "f", "e", "b", "b" };
		List<String> list = new ArrayList<String>();
		List<String> resultList = new ArrayList<String>();

		for(int i=0; i<a2.length; i++)
		{
			for(int j=0; j<a1.length; j++)
			{
				if(a2[i]==a1[j])
				{
					list.add(a2[i]);
				}
			}
		}


		for (int i = 0; i < list.size(); i++) 
		{
			if (!resultList.contains(list.get(i)))
			{
				resultList.add(list.get(i));
			}
		}


		for (int i = 0; i <resultList.size(); i++)
		{
			if(i==0)
				System.out.print("["+resultList.get(i));
			else if(i+1==resultList.size())
				System.out.println(", "+ resultList.get(i)+"]");
			else
				System.out.print(", "+ resultList.get(i));
		}

	}
}
