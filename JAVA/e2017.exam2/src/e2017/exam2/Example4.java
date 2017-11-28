package e2017.exam2;

public class Example4 {

    int a = 3, b = 4;

    void doSomethoing() {
    	int tmp;
    	tmp = a;
    	a = b;
    	b = tmp;
    	
        System.out.printf("%d %d\n", a, b);
    }

    public static void main(String[] args) {
        new Example4().doSomethoing();
    }
}
