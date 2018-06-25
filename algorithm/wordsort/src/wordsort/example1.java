package wordsort;

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

public class example1 {
	
	static void sort(WordInfo[] wordsort)
	{
		WordInfo temp = new WordInfo("",0);
		
		for(int i = 0 ; i<wordsort.length-1; i++)
		{
			for(int j = 0 ; j<wordsort.length-1; j++)
			{
				if(wordsort[j].count < wordsort[j+1].count) 
				{
					temp.word = wordsort[j].word;
					temp.count = wordsort[j].count;
					wordsort[j].word = wordsort[j+1].word;
					wordsort[j].count = wordsort[j+1].count;
					wordsort[j+1].word = temp.word;
					wordsort[j+1].count = temp.count;
				}
			}		
		}
		
		for(int i = 0 ; i<10; i++)
			System.out.println(wordsort[i].word + " - " + wordsort[i].count + "번");
		
	}
	
	
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

		sort(wordsort);
	}

}
