import java.io.*;
import java.nio.file.*;
public class LongestStrinFile {

	public static void main(String[] args) {
			try {
				  Path fileName = Path.of("C:\\Users\\shivamk\\Downloads\\File.txt");
		
		        String str = Files.readString(fileName);
		        
		        String regex = "[^a-zA-Z0-9\\s]";
		        
		        String processed_str = str.replaceAll(regex, "");
		        
		        String strArray[] = processed_str.split("\\s+");
		        String maxlen = "";
		        int max = 0;
		        for(int i=0; i<strArray.length; i++) {
		        	String test = strArray[i];
		        	if(test.length() > max) {
		        		max = test.length();
		        		maxlen = test;
		        	}
		        }
		        System.out.print(maxlen);
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
	}

}
