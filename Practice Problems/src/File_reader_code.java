import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Arrays; 

public class File_reader_code {

	public static void main(String[] args) throws IOException {
	    Path path = Paths.get("C:\\Users\\shivamk\\Downloads\\File.txt"); 
	        byte[] arr = Files.readAllBytes(path); 
	        System.out.println(Arrays.toString(arr)); 
	}
}
