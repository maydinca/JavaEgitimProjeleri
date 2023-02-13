package Calculator;

import java.util.Scanner;

public class Calculator_02_operation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2;
        String operation;

        System.out.println("İlk sayıyı girin: ");
        num1 = input.nextDouble();

        System.out.println("İşlemi girin (+, -, *, /): ");
        operation = input.next();

        System.out.println("İkinci sayıyı girin: ");
        num2 = input.nextDouble();

        if (operation.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operation.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operation.equals("*")) {
            System.out.println(num1 * num2);
        } else if (operation.equals("/")) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Geçersiz işlem.");
        }
    }
}
