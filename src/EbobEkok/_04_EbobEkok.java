package EbobEkok;

import java.util.Scanner;

public class _04_EbobEkok {
    public static void main(String[] args) {
        int bigNumber = 0,smallNumber = 0;

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter first digit: ");
        int firstNumber = scn.nextInt();
        System.out.print("Enter second digit : ");
        int secondNumber = scn.nextInt();

        if (firstNumber > secondNumber) {
            bigNumber = firstNumber;
            smallNumber = secondNumber;
        }
        else if (firstNumber < secondNumber) {
            smallNumber = firstNumber;
            bigNumber = secondNumber;
        }

        calculateGcd(bigNumber , smallNumber);	// OBEB - GREATEST COMMON DIVISOR
        calculateLcm(bigNumber , smallNumber); // OKEK - LEAST COMMON MULTIPLE
    }

    static void calculateGcd(int bigNumber , int smallNumber) {
        int obeb = 1, i = 2;
        while (i <= smallNumber) {
            while (smallNumber % i == 0 && bigNumber % i == 0){
                smallNumber /= i;
                bigNumber /= i;
                obeb *= i;
            }
            i++;
        }
        System.out.printf("OBEB : %d \n" , obeb);
    }

    static void calculateLcm(int bigNumber , int smallNumber) {
        int okek = 1,i = 2;
        while (i <= bigNumber){
            while (bigNumber % i == 0 && smallNumber % i == 0){
                bigNumber /= i;
                smallNumber /= i;
                okek *= i;
            }
            while (bigNumber % i == 0){
                bigNumber /= i;
                okek *= i;
            }
            while (smallNumber % i ==	 0){
                smallNumber /= i;
                okek *= i;
            }
            i++;
        }
        System.out.printf("OKEK : %d \n" , okek);
    }
}
