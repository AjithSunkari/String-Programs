package StringProblems;

import java.util.Map;
import java.util.HashMap;

public class NonRepeatingElements {

	public static void main(String[] args) {
		String str="abcd";
		str=str.toLowerCase();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else
				map.put(ch, 1);
			
		}
		for(java.util.Map.Entry<Character, Integer> entrySet : map.entrySet()) {
			if(entrySet.getValue()==1) {
				System.out.println(entrySet.getKey());
			}
		}

	}

}
