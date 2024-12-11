package StringProblems;

import java.util.Scanner;

public class PrintFirstandLastletters {
	void print(String str) {
		str=str.trim()+" ";
		String word="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isWhitespace(ch)) {
				System.out.println(word.charAt(0)+" "+word.charAt(word.length()-1));
				word="";
			}
			else {
				word=word+ch;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);                
		System.out.println("Input:" );
		String str=sc.nextLine();
		PrintFirstandLastletters p=new PrintFirstandLastletters();
		p.print(str);
	}
}
