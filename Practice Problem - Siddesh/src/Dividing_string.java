import java.util.Scanner;
public class Dividing_string {

	public static void main(String[] args) {
		
//		2.Java Program to divide a string in 'N' equal parts.
//		input :str = "aaaabbbbcccc"
//		 n =3
//		output:
//		aaaa
//		bbbb
//		cccc
		Scanner sc = new Scanner(System.in);
		String str = "aaaabbbbcccc";
		System.out.println("In how many parts you have to divide the string "+str+": ");
		int n = sc.nextInt();
		int len = str.length()/n;
		
		for(int i=0; i<str.length(); i += len) {
			System.out.println(str.substring(i, i+len));
		}
	}

}
