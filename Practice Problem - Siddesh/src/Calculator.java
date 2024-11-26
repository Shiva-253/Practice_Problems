import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// 1.Java Program to Make a Simple Calculator Using switch case
		
		System.out.println("-----------------------------------------------Simple Calculator-------------------------------------------------------");
		
		while(true) {
		System.out.println("1. Add two numbers \n2. Subtract two numbers \n3. Multiply two numbers \n4. Divide two number \n5. To exit the calculator\n\nEnter your choice:");
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		if(choice == 5) {
			System.out.println("Exiting the calculator");
			break;
		}
		else if(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
			System.out.println("Entered a wrong choice\n\n");
			continue;
		}
		
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.println();
		
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		
		System.out.print("\n\n");
		
		switch(choice) {
		case 1:
			System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
			System.out.print("\n\n");
			break;
		case 2:
			System.out.println("Subtration of "+num1+" from "+num2+" is "+(num2-num1));
			System.out.print("\n\n");
			break;
		case 3:
			System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
			System.out.print("\n\n");
			break;
		case 4:
			System.out.println("Division of "+num1+" by "+num2+" is "+(num1/num2));
			System.out.print("\n\n");
			break;
		}
		}

	}

}
