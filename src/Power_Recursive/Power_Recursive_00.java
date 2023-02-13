package Power_Recursive;

import java.util.Scanner;

public class Power_Recursive_00 {

    static int calc(int power, int base) {
        if (power == 0) {
            return 1;
        }
        return calc(power - 1, base) * base;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, power;
        do {
            System.out.print("Enter the base number(x) : ");
            base = scanner.nextInt();

            System.out.print("Enter the Exponent number(y) : ");
            power = scanner.nextInt();

            System.out.println("Number is ===> " + calc(power, base));

        } while ((base >= 0) && (power >= 0));
    }
}
