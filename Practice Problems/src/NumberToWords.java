import java.util.*;
public class NumberToWords {

	public static void main(String[] args) {
		
//		Write a Java program to convert Numbers to words.
		int num = 390239;
		StringBuilder sb = new StringBuilder();
		String num_to_str = "";
		
		String nums[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		while(num != 0) {
			int no = num % 10;
			num = num / 10;
			
			num_to_str += nums[no];
			num_to_str += " ";
		}
		String[] strArray = num_to_str.split(" ");
		for(int i = strArray.length-1; i>=0 ; i--) {
			System.out.print(strArray[i]+" ");
		}
	}

}
