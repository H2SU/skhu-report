package recursive3;

public class Example4 
{ 
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

		public void addTail(int value) 
		{ 
			if(this.next == null)
				this.next = new Node(value, null);
			else 
				this.next.addTail(value);
		} 
	} 

	public static void main(String[] args) 
	{ 
		Node root = new Node(0, null); 
		for (int i = 1; i <= 10; ++i) 
			root.addTail(i); 
		root.printAll(); 
	} 
}
