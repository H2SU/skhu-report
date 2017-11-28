package e2017.exam2;

import java.util.HashMap;
import java.util.Random;

public class Example5 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[20];
        int[] b = {0,0,0,0,0};
        
        for (int i = 0; i < a.length; ++i)
            a[i] = random.nextInt(5);

        for(int i = 0; i<a.length; i ++)
        {
        	if(a[i]==0)
        		b[0]++;
        	else if(a[i] == 1)
        		b[1]++;
        	else if(a[i] == 2)
        		b[2]++;
        	else if(a[i] == 3)
        		b[3]++;
        	else if(a[i] == 4)
        		b[4]++;
        }
        
        	System.out.println("0="+b[0]+"\t\t1="+b[1]+"\t\t2="+b[2]+"\t\t3="+b[3]+"\t\t4="+b[4]);
    }
}
