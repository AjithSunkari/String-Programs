package StringProblems;

import java.util.Scanner;

public class FindASCIIValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch=sc.next().charAt(0);
		//char ch='a';
		int ascii=ch;
		System.out.println("The ASCII value of "+ch+" is: "+ascii);

	}

}
