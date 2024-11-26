
public class total_char_in_str {

	public static void main(String[] args) {
//		4.count the total number of characters in a string
//		input :string = "The best of both worlds".
//		output: Total number of characters in a string: 19
		
		String string = "The best of both worlds";
		int count = 0;

		for(int i=0; i<string.length(); i++) {
			if((int)string.charAt(i) >= 65 && (int)string.charAt(i) <= 90 || (int)string.charAt(i) >= 97 && (int)string.charAt(i) <= 122 ) {
				count++;
			}
		}
		System.out.println("Total number of characters in a string: "+count);
	}

}
