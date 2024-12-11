package StringProblems;

public class RemoveDuplicates {
	public static String RemoveDuplicate(String str) {
		String newstr="";
		for(int i=0;i<str.length();i++) {
			int j=0;
			for(j=0;j<i;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					break;
				}
			}
				if(i==j) {
					newstr=newstr+str.charAt(i);
				}
			}
		return newstr;
	}

	public static void main(String[] args) {
		String str="aabbcdeef";
		System.out.println("Before removing Duplicates "+str);
		String result=RemoveDuplicate(str);
		System.out.println("After removing Duplicates: "+result);

	}

}
