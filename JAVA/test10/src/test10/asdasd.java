package test10;

public class asdasd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] a1 = new Object[4];
		a1[0] = new Integer[] {11,22,33};
		a1[1] = new String[] { "a", "b", "c"};
		a1[2] = 4;
		a1[3] = new Data[] {new Data(5,"d"), new Data(6,"e")};
		
		System.out.println(a1[0]);
		System.out.println(a1[1]);
		System.out.println(a1[2]);
		System.out.println(a1[3]);
	}
	
}
class Data{
	int i; String s;
	
	public Data(int i, String s) {
		this.i = i;
		this.s = s;
	}
}
