package StringProblems;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str="I love India";
		
		//inbuilt method to remove spaces in string
		str=str.replaceAll("\\s", "");           
		System.out.println("String after removing whitespaces: \n"+str);
	}
}
