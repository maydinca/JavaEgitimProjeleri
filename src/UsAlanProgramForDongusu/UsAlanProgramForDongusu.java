package UsAlanProgramForDongusu;

import java.util.Scanner;

public class UsAlanProgramForDongusu {
    /*
    Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
    */
    public static void main(String[] args) {
        int x, y, total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen üssü alınacak sayıyı giriniz = ");
        x = input.nextInt();
        System.out.print("Lütfen üs sayisini giriniz = ");
        y = input.nextInt();

        for (int i = 1; i <= y; i++) {
            total *= x;
        }
        System.out.print("Ussu Alinmis Sayi ===> " + total);
    }
}
