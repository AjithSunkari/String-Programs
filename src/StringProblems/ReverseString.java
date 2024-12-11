package StringProblems;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		/*String str="ABCD";
		int length=str.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed String is:\n"+rev);*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		char a[]=str.toCharArray();
		String rev="";
		int length=a.length;
		for(int i=length-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println("Reversed Array is: "+rev);
	}

}
