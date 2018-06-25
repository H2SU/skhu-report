package example3;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
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
	
	public String toString()
	{
		return word + " - " + count + "번";
	}
}


public class example3 {
    static int partition(ArrayList<WordInfo> a, int start, int end) {
    		WordInfo value = a.get(end);                    // 기준값
        int i = start - 1;                     // i는 1구역의 끝지점
        for (int j = start; j <= end - 1; ++j) // j는 3구역의 시작 지점
            if (a.get(j).count > value.count)          // a[j] 값이 1구역에 속하면
                Collections.swap(a, ++i, j);       // a[j] 값을 1구역의 끝에 추가한다. 1구역 크기 1증가.
        Collections.swap(a, i + 1, end);           // 기준값인 a[end] 원소와 2구역의 시작 원소를 교환한다.
        return i + 1;                  // 기준값 위치 리턴
    }

    // a 배열의 start~end 에서 nth 번째 작은 값을 리턴한다.
    static WordInfo select(ArrayList<WordInfo> a, int start, int end, int nth) {
        if (start >= end) return a.get(start);     // 찾을 배열의 크기가 1 이면 리턴
        int middle = partition(a, start, end); // 배열 나누기
        int middle_nth = middle - start + 1;   // middle 위치의 값이 start~end 에서 middle_nth 번째 작은 값
        if (nth == middle_nth) return a.get(middle); // 찾았으면 리턴
        if (nth < middle_nth)
            return select(a, start, middle-1, nth); // 앞 부분에서 찾는다.
        else
            return select(a, middle+1, end, nth - middle_nth); //  뒷 부분에서 찾는다.
    }

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
				for(int i =1; i<11; i++)
				{
					System.out.println(select(list,0,list.size()-1,i));
				}
	}

}
