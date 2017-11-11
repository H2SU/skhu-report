package lab0_8;
/* ¹®Á¦:  Àç±Í ¸Ş¼Òµå¸¦ Á¤ÀÇÇÏ°í È£ÃâÇÏ´Â ÇÁ·Î±×·¥
 * ÀÛ¼ºÀÚ: ±èÈñ¼ö
 * ÀÛ¼ºÀÏ: 17.11.10
 */
public class RecursionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab0_8 : ±èÈñ¼ö");
		
		f(4); // 1234
		System.out.println();
		g(4); // 4321
		System.out.println();
		
		System.out.println("ÇÕ: " + sum(4));
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
