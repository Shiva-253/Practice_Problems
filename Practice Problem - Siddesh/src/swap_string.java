
public class swap_string {

	public static void main(String[] args) {
//		5.swap two string variables without using third or temp variable.
		
		String str1 = "krishna";
		String str2 = "balaram";
		
		System.out.println("Strings before swapping\nstr1 = "+str1+"\nstr2 = "+str2);
		
		System.out.println();
		int len1 = str1.length();
		int len2 = str2.length();
		
		str1 = str1+str2;           //krishnabalaram      
		str2 = str2+str1;           //balaramkrishnabalaram      
		
		str1 = str1.substring(len1);
		str2 = str2.substring(len2,len2+len1);
		System.out.println("Strings after swapping\nstr1 = "+str1+"\nstr2 = "+str2);
	}

}
