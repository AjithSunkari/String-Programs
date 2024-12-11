package StringProblems;

public class SubStringPosition {
	public static int index(String str, String sub) {
		int m=str.length();
		int n=sub.length();
		for(int i=0;i<m;i++) {
			int temp=i;
			int j=0;
			for(j=0;j<n;j++) {
				if(str.charAt(temp)!=sub.charAt(j)) {
					break;
				}
				temp++;
			}
			if(j==n) {
				return i;
			}
		}
		return -1;
	
	}

		public static void main(String[] args) throws java.lang.Exception {
		    String str = "takeuforward";
		    String sub = "forward";

		    int foundIdx = index(str, sub);

		    System.out.println("The substring starts from the index: "+foundIdx);
		/*String str="I love you";
		String str1="love";
		int first=str.indexOf(str1);
		System.out.println(first);*/
		
		

	}

}
