package Power_Recursive;

import java.util.Scanner;

public class Power_Recursive_03 {
    public static Scanner userInput = new Scanner(System.in);
    public static double power(int base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        } else if (exponent < 0) {
            return 1.0 / power(base, -exponent);
        } else {
            return base * power(base, exponent - 1);
        }
    }
    public static void main(String[] args) {
        int base,exponent;
        double result;

        System.out.print("Enter the base: ");
        base = userInput.nextInt();
        System.out.print("Enter the exponent: ");
        exponent = userInput.nextInt();
        result = power(base, exponent);

        System.out.println("Number is ==> "+base + "^" + exponent + " = " + result);
    }
}
