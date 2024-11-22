public class PowerOfNum {

    public static void main(String[] args) {
    	// 2. Calculate the power of a number without using multiplication and division operators. 
    	
        int num = 4;
        int pow = 3;
        System.out.println("The value of "+num+" to power of "+pow+" is " + calcPower(num, pow)); 
    }

    public static int multiply(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        } else if (num2 > 0) {
            return num1 + multiply(num1, num2 - 1);
        }
        return -1;
    }

    public static int calcPower(int num, int pow) {
        if (pow == 0) {
            return 1;
        } else if (pow == 1) {
            return num;
        } else {
            return multiply(num, calcPower(num, pow - 1));
        }
    }
}
