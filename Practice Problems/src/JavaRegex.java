import java.util.regex.*;  
public class JavaRegex {

	public static void main(String[] args) {
		
		String str = "pq";
		boolean matcher = Pattern.matches("^p.*q$", str); 
		if(matcher) {
			System.out.print("String "+ str + " matches the pattern");	
		}
		else {
		System.out.print("String "+ str + " does not matches the pattern");
		}
	}

}
