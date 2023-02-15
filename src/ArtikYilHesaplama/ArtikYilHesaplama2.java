package ArtikYilHesaplama;

import java.util.Scanner;

/**
    What is a leap year?
        A normal year has 365 days. A Leap Year has 366 days. So, the extra day is the 29th of February.

 * A leap year is exactly divisible by 4 except for century years.
 * 1988 - 1992 - 1996 - 2000 - 2004
 * If it can be exactly divided by 100 (century years), then it isn't a leap year.
 * 1700 - 2100 - 2200
 * The century year is a leap year only if it is perfectly divisible by 400.
 * 1200 - 1600 - 2000
 */
public class ArtikYilHesaplama2 {
    public static void main(String[] args) {
            int yil;
            boolean artikYilMi = false;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Lutfen bir yil giriniz : ");
            yil = scanner.nextInt();

            if (yil % 4 == 0) {
                if (yil % 100 == 0) {
                    if (yil % 400 == 0) {
                        artikYilMi = true;
                    }
                } else {
                    artikYilMi = true;
                }
            }
            if (artikYilMi) {
                System.out.println("Bir Artık Yıldır!");
            } else {
                System.out.print("Bir Artık Yıl Değildir!");
            }
        }
    }

