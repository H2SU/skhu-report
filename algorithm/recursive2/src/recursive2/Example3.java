package recursive2;

public class Example3 { 
	static class Node 
	{ 
		int value; 
		Node next; 
		public Node(int value, Node next) 
		{ 
			this.value = value; 
			this.next = next; 
		} 
		public void printAll() 
		{ 
			if(this.next==null) {
				System.out.print(this.value+" ");
				return;
			}

			System.out.print(this.value+" ");
			this.next.printAll();
		} 
	} 

	public static void main(String[] args) 
	{ 
		Node root = null; 
		for (int i = 1; i <= 10; ++i) 
			root = new Node(i, root); 
		root.printAll(); 
	} 
}