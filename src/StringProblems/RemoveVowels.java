package StringProblems;

import java.util.Scanner;

public class RemoveVowels {
	void removeVowels(String str) {
	String str1="";
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(!(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')) {
			str1=(str1+ch);
		}
	}
		System.out.println("String after removing Vowels: "+str1);
	}

	public static void main(String[] args) {
		RemoveVowels rv=new RemoveVowels();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		rv.removeVowels(str);

	}

}
