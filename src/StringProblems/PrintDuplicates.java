package StringProblems;
import java.util.*;

public class PrintDuplicates {

	public static void main(String[] args) {
		String str="Babulal";
		str=str.toLowerCase();
		int length=str.length();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<length;i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);	
			
		}
		
		for (Map.Entry < Character, Integer > entry: map.entrySet())
            if (entry.getValue() > 1)
                System.out.println(entry.getKey() + " - " + entry.getValue());

	}

}
