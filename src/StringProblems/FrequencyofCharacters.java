package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class FrequencyofCharacters {

	public static void main(String[] args) { 
		String str="Babulal Sheik";
		str=str.toLowerCase();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(char ch:str.toCharArray()) {
			if(map.get(ch)==null) {
				map.put(ch, 1);
			}
			else
				map.put(ch, map.get(ch)+1);
		}
		map.forEach((key, value) -> {
			System.out.println(key+" count "+value);
		});

	}

}
