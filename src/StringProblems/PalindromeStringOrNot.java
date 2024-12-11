package StringProblems;

public class PalindromeStringOrNot {

	public static void main(String[] args) {
		String str="Babulal";
		String temp=str;
		String newstr="";
		for(int i=str.length()-1;i>=0;i--) {
			newstr=newstr+str.charAt(i);
		}
		if(newstr.equals(temp)) {
			System.out.println(str+" is a palindrome string");
		}
		else
			System.out.println(str+" is not a palindrome string");
	}

}
