package StringProblems;

import java.util.Scanner;

public class RemoveCharactersExceptAlphabets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		
		//inbuilt method to remove Characters except Alphabets
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}

}
