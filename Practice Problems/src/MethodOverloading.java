
public class MethodOverloading {

	public static void main(String[] args) {
		
		System.out.println("Sum with public int sum(int num1, int num2, int num3) function is " + sum(2,6,3));
		System.out.println("Sum with public int public static float sum(float num1, float num2, float num3) function is " + sum(2.2f,6.0f,3.8f));
		System.out.println("Sum with public int sum(int num1, int num2) function is " + sum(2,6));

	}
	
	public static int sum(int num1, int num2, int num3) {
		return (num1+num2+num3);
	}
	
	public static float sum(float num1, float num2, float num3) {
		return (num1+num2+num3);
	}
	
	public static int sum(int num1, int num2) {
		return (num1+num2);
	}

}
