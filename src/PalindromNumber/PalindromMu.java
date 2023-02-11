package PalindromNumber;

import java.util.Scanner;

public class PalindromMu {
    static boolean isPalindrom(int number) {

        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
            System.out.println("RS :"+reverseNumber+"\n*****");

        }
        if (number == reverseNumber) {
            System.out.println("Palidrom sayıdır:");
            return true;

        } else {
            System.out.println("Palidrom sayı değildir:");
            return false;

        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int n = inp.nextInt();
        System.out.println(isPalindrom(n));
    }
}

