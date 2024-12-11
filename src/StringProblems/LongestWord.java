package StringProblems;

public class LongestWord {
	public static void main(String[] args) {
		String s="Babulal is a good Boy";
		s=s+"";
		String word="";
		String LongestWord="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!=' ') {
				word=word+ch;
			}
			else if(word.length()>LongestWord.length()) {
				LongestWord=word;
				word="";
			}
		}
		System.out.println(LongestWord);
	}

}
