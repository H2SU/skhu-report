package example2;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class WordInfo 
{ 
	String word; 
	int count; 

	public WordInfo(String word) 
	{ 
		this.word = word; 
		this.count = 1; 
	}
}


public class example2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String filePath = "shakespeare.txt";
		Scanner scanner = new Scanner(Paths.get(filePath)); 
		scanner.useDelimiter("[^a-zA-Z]+"); 
		boolean isContains = false;
		WordInfo wi;
		
		ArrayList<WordInfo> list = new ArrayList<WordInfo>();
		while (scanner.hasNext())
		{
			String word = scanner.next();
			word = word.toLowerCase();
			wi = new WordInfo(word);
			isContains = false;
			if (list.isEmpty())
				list.add(wi);
			else
			{
				
				for(WordInfo w: list)
				{
					
					if(w.word.equals(word))
					{
						w.count++;
						isContains = true;
						break;
					}
				}	
				if(!isContains)
					list.add(wi);
			}

		}

		Collections.sort(list, new Comparator<WordInfo>()
		{
			@Override
			public int compare(WordInfo a, WordInfo b)
			{
				return b.count - a.count;
			}
		});
				for(int i =0; i<10; i++)
				{
					System.out.println(list.get(i).word+" - "+list.get(i).count+"번");
				}
	}

}
