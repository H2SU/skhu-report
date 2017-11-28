package e2017.exam2;

import java.util.ArrayList;

public class Example1 {

    public static void main(String[] args) {
        String[] a = { "d", "a", "b", "a", "c", "d", "e", "f", "e" };
        String[] b = new String[a.length];
        int len = 0;
        
        for(int i = 0 ; i<a.length; i++)
        {
        	boolean isOverlap = false;
        	for(int j=0; j<b.length; j++)
        	{
        		if(b[j] == a[i])
        			isOverlap = true;
        	}
        	
        	if(!isOverlap)
        	{
        		b[len] = a[i];
        		len++;
        	}
        	
        }
        
        for(int i = 0; i<len; i++)
        {
        	if(i==0)
        		System.out.print("["+b[i]);
        	else if(i+1==len)
        		System.out.println(", "+ b[i]+"]");
        	else
        		System.out.print(", "+ b[i]);
        }
        
    }
}
