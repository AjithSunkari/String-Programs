package StringProblems;

public class CalculateVowelsConsonentsSpaces {
	public static void solve(String str, int length) { 
		int vowels=0, consonents=0, whitespaces=0;
		str=str.toLowerCase();
		for(int i=0;i<length;i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' ||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
			}
			else if(ch>='a' && ch<='z') {
				consonents++;
			}
			else if(ch==' ') {
				whitespaces++;
			}
		}
		
		System.out.println("Number of vowels is: "+vowels);
		System.out.println("Number of consonents is: "+consonents);
		System.out.println("Number of whitespaces are: "+whitespaces);
	}

	public static void main(String[] args) {
		String str="Babulal Sheik";
		System.out.println(str);
		int length=str.length();
		solve(str,length);
		
	}
}
 
