public class mul2nums {

    public static void main(String[] args) {
        // Multiply two integers without using multiplication, division, bitwise operators, and loops.
        int result = multiply(128645, 880);
        System.out.println(result);
    }
    
    public static int multiply(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        } 
        else if (num2 > 0) {
            return num1 + multiply(num1, --num2);
        } 
        return -1;
    }
}
