package YildizlarIleUcgen;
import java.util.Scanner;

/*
             *
            ***
           *****
          *******
         *********
          *******
           *****
            ***
             *
 */
public class ElmasYapimi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = scan.nextInt();
        int space = n;

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int t = 1; t <= n - i; t++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= 2 * i - 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}