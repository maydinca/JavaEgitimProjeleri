package EvenNumbers;

import java.util.Scanner;

public class DordunKatlari {
    public static void main(String[] args) {
        int kullaniciSayisi, total = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; ; i++) {
            System.out.print("Bir sayi giriniz: ");
            kullaniciSayisi = scan.nextInt();


            if ((kullaniciSayisi % 2 == 0)
                || (kullaniciSayisi % 4 == 0)){
                total+=kullaniciSayisi;
              continue;

            }else {
                break;
            }
        }
        System.out.println("Toplam: " + total);
    }
}
