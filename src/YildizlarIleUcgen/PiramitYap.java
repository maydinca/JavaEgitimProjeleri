package YildizlarIleUcgen;

import java.util.Scanner;

public class PiramitYap {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Ucgen kac satirdan olsun?");
        int satirSayisi=scan.nextInt();

        for (int satir = 0; satir <satirSayisi ; satir++) {
            for (int bosluk = 0; bosluk < satirSayisi-(satir+1); bosluk++) {
                System.out.print(" ");

            }
            for (int yildiz = 0; yildiz <1+(satir*2) ; yildiz++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
