package StringProblems;

public class CapitalizeFirtandLast {

	public static void main(String[] args) {
		String str = "hello";
        String newstr = "";
        String[] arr = str.split(" ");
        
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            // Handle words with length 1 separately (just capitalize the single letter)
            if (word.length() == 1) {
                newstr += word.toUpperCase() + " ";
            } else {
                // Capitalize the first and last characters, and make the middle part lowercase
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() - 1).toLowerCase();
                
                newstr += Character.toUpperCase(firstChar) + middle + Character.toUpperCase(lastChar) + " ";
            }
        }
        
        // Trim the trailing space before printing
        System.out.println(newstr.trim());
    }
}