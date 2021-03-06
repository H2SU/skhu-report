package lab0_8;
/* 문제:  재귀 메소드를 정의하고 호출하는 프로그램
 * 작성자: 김희수
 * 작성일: 17.11.10
 */
public class RecursionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab0_8 : 김희수");
		
		f(4); // 1234
		System.out.println();
		g(4); // 4321
		System.out.println();
		
		System.out.println("합: " + sum(4));
	}
	
	private static void f(int n) {
		if(n>0) {
			f(n-1);
			System.out.println(n + " ");
		}
	}
	
	private static void g(int n) {
		if(n>0) {
			System.out.println(n + " ");
			g(n-1);
		}
	}
	
	private static int sum(int n) {
		int[] arr;
		if(n>0) {
			return n + sum(n-1);
		}
		else
			return 0;
	}

}
