package fibonacci;

public class main {
	
	static int fibo(int n)
	{
		if(n==1|n==2)
			return 1;
		else
			return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(0));
	}

}
