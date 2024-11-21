import java.util.ArrayList;
public class PrimeNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=2; i<1000; i++) {
			if(isPrime(i)) {
				al.add(i);
			}
		}
		System.out.println(al);
	}
	public static boolean isPrime(int number) {
		boolean isPrime = true;
		
		for(int i=2; i<number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
}
