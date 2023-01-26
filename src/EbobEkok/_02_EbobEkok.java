package EbobEkok;

import java.util.Scanner;

public class _02_EbobEkok {
    public static void main(String[] args) {
        int a, b, ekok = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz:");
        a = inp.nextInt();
        System.out.print("Ikinci sayiyi giriniz:");
        b = inp.nextInt();
        int toplam = a * b;
        int x = a;

        while (a > 0) {
            if ((a % x == 0) && (b % x == 0)) {
                System.out.println("ebob : " + x);
                break;
            }else
                x--;
        }
        while (a > 0 && b > 0) {
            ekok = (a * b) / x;
            System.out.println("ekok: " + ekok);
            break;
        }
    }
}
