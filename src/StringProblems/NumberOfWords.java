package StringProblems;

public class NumberOfWords {

	public static void main(String[] args) {
		String s="Iam babulal sheik";
		int words=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				words++;
			}
		}
		System.out.println("The no.of words in a string are "+ (words+1));
	}

}
