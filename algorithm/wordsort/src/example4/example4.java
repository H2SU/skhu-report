package example4;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

class WordInfo 
{ 
	String word; 
	int count; 

	public WordInfo(String word, int count) 
	{ 
		this.word = word; 
		this.count = count; 
	}
}

class Node{
	WordInfo data;
	Node left;
	Node right;
	
	public Node(WordInfo data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public void add(WordInfo data)
	{
		if(data.count<this.data.count)
		{
			if(left==null)
				left = new Node(data);
			else
				left.add(data);
		}
		else if(data.count>this.data.count)
		{
			if(right==null)
				right = new Node(data);
			else
				right.add(data);
		}
		else if(data.count==this.data.count)
		{
			if(this.data.word.compareTo(data.word)>0)
				if(left==null)
					left = new Node(data);
				else
					left.add(data);
			else
				if(right==null)
					right = new Node(data);
				else
					right.add(data);
		}
	}
	
	public void print() 
	{ 
		if (left != null) 
			left.print(); 
		System.out.println(this.data.word+" - "+this.data.count+"번"); 
		if (right != null) 
			right.print(); 
		}
}
public class example4 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String filePath = "shakespeare.txt";
		Scanner scanner = new Scanner(Paths.get(filePath)); 
		scanner.useDelimiter("[^a-zA-Z]+"); 

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		while (scanner.hasNext())
		{
			String word = scanner.next();
			word = word.toLowerCase();

			if (map.containsKey(word))
				map.put(word, map.get(word)+1);
			else
				map.put(word, 1);
		}

		WordInfo[] wordsort = new WordInfo[map.size()];
		
		int idx = 0;
		for(String key: map.keySet())
		{
			wordsort[idx] = new WordInfo(key,map.get(key));
			idx++;
		}

		Node root = new Node(wordsort[0]);
		for(int i=1; i<wordsort.length; i++)
		{
			root.add(wordsort[i]);	
		}
		
		root.print();
	}

}
