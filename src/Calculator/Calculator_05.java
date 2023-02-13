package Calculator;

import java.util.Scanner;

public class Calculator_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, ^, s, %, a, !): ");
        char operator = scan.next().charAt(0);

        double result = 0;
        switch (operator) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            case '^':
                result = power(num1, num2);
                break;
            case 's':
                result = square(num1);
                break;
            case '%':
                result = modulo(num1, num2);
                break;
            case 'a':
                result = area(num1, num2);
                break;
            case '!':
                result = factorial((int) num1);
                break;
            default:
                System.out.println("Error! operator is not correct");
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double power(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public static double square(double num1) {
        return Math.sqrt(num1);
    }

    public static double modulo(double num1, double num2) {
        return num1 % num2;
    }

    public static double area(double num1, double num2) {
        return num1 * num2;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
