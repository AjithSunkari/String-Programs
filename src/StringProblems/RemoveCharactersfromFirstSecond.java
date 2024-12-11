package StringProblems;

public class RemoveCharactersfromFirstSecond {
	public static String RemoveCharacter(String str1, String str2) {
		StringBuffer ans=new StringBuffer();
		for(int i=0;i<str1.length();i++) {
			int count=0;
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					count=1;
				}
			}
			if(count!=1) {
				ans.append(str1.charAt(i));
			}
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		String str1="abcdef";
		String str2="cdef";
		String result=RemoveCharacter(str1,str2);
		System.out.println(result+" ");
	}

}
