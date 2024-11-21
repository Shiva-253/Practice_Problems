
public class FizzBuzz {
//	FizzBuzz problem : Write a Java program that prints the numbers from 1 to 50. But for multiples of three print "Fizz" instead of the number 
//	and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz
	
	public static void main(String[] args) {
		for(int i=1; i<=50; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.print("FizzBuzz ");
			}
			else if(i % 3 == 0) {
				System.out.print("Fizz ");
			}
			else if(i % 5 == 0) {
				System.out.print("Buzz ");
			}
			else {
			System.out.print(i+" ");
			}
		}
	}

}
