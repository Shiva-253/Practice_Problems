import java.util.regex.*;  
public class NumOfVowels {

	public static void main(String[] args) {
		String Str = "This is a string";
		
		System.out.println("Vowels count in the string is "+ countVowels(Str));
	}
	
	public static int countVowels(String myStr) {
		int count = 0;
		for(int i=0; i<myStr.length(); i++) {
			char ch = myStr.charAt(i);
			boolean matcher = Pattern.matches("[aeiouAEIOU]", Character.toString(ch)); 
			if(matcher) {
				count++;
			}
		}
		return count;
	}
}
