package Power_Recursive;

import java.util.Scanner;

public class Power_Recursive_01 {

    public static class UsluSayi {
        static int power(int x, int y) {
            if (y > 0) {
                return x * power(x, y - 1);
            } else if (y < 0) {
                return power(x, y + 1) / x;
            } else {
                return 1;
            }
        }

        public static void main(String[] args) {
            int x, y;
            Scanner inp = new Scanner(System.in);
            System.out.print("Taban değerini giriniz :");
            x = inp.nextInt();
            System.out.print("Üs değerini giriniz :");
            y = inp.nextInt();
            inp.close();

            System.out.println("Number : " + power(x, y));
        }
    }
}
