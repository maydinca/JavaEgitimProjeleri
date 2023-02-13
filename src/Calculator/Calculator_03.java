package Calculator;

import java.util.Scanner;

public class Calculator_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String expression = scan.nextLine();
        int result = evaluateExpression(expression);
        System.out.println("Result: " + result);
    }

    public static int evaluateExpression(String expression) {
        char[] tokens = expression.toCharArray();
        int result = 0;
        int currentValue = 0;
        char currentOperator = '+';

        for (int i = 0; i < tokens.length; i++) {
            char token = tokens[i];

            if (token == ' ') {
                continue;
            }

            if (token >= '0' && token <= '9') {
                currentValue = currentValue * 10 + (token - '0');
            } else {
                switch (currentOperator) {
                    case '+':
                        result += currentValue;
                        break;
                    case '-':
                        result -= currentValue;
                        break;
                    case '*':
                        result *= currentValue;
                        break;
                    case '/':
                        result /= currentValue;
                        break;
                }

                currentValue = 0;
                currentOperator = token;
            }
        }

        return result + currentValue;
    }
}