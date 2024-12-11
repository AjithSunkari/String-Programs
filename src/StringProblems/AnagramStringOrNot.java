package StringProblems;

import java.util.Arrays;

public class AnagramStringOrNot {
	public static boolean isAnagram(String str1, String str2) {
		str1=str1.replaceAll("\\s", "");
		str1=str1.toLowerCase();
		str2=str2.replaceAll("\\s", "");
		str2=str2.toLowerCase();
		if(str1.length()!=str2.length()) {
			return false;
		}
		else {
			char[] c1=str1.toCharArray();
			char[] c2=str2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);
			
		}
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("LISTEN", "SILENT"));
		

	}

}

