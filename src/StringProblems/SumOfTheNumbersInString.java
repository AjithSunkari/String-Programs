package StringProblems;

public class SumOfTheNumbersInString {

	public static void main(String[] args) {
		String str="AB2CD5EF8";     //mix of numeric digits and alphabets
		int sum=0;
		for(int i=0; i<str.length(); i++) {			
		    char ch =str.charAt(i);
		    
		    //method to verify char is digit
		    if(Character.isDigit(ch)) {
		    	
		    	//method to convert char to int
		    	sum=sum+Integer.parseInt(String.valueOf(ch)); 
		    }
		    
	}
		System.out.println(sum);

}
}
