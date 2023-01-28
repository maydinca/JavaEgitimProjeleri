package EbobEkok;

import java.util.Scanner;

public class _04_EbobEkok {

    public static Scanner scn = new Scanner(System.in);
    public static int bigNumber = 0;
    public static int smallNumber = 0;
    public static int obeb = 1;
    public static int i = 2;

    public static int okek = 1;


    public static void main(String[] args) {

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
            while (smallNumber % i == 0){
                smallNumber /= i;
                okek *= i;
            }
            i++;
        }
        System.out.printf("OKEK : %d \n", okek);
    }
}
