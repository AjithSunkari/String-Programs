package StringProblems;

public class LexicographicOrder {

	public static void main(String[] args) {
		String s="Babulal";
		String result="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);                            //z is not replacing with a with this code
			result=result+(char)(((int)ch)+1);
		}
		System.out.println(result);
	}

}
