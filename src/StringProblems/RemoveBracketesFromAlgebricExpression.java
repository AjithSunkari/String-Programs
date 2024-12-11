package StringProblems;

import java.util.Scanner;

public class RemoveBracketesFromAlgebricExpression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an algebric expression");
		String str=sc.nextLine();
		String str1=str.replaceAll("[(){}]", "");
		System.out.println(str1);
	}

}
