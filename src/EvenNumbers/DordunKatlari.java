package EvenNumbers;

import java.util.Scanner;

public class DordunKatlari {

    /*
    Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift
     ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
     */
    public static void main(String[] args) {
        int kullaniciSayisi, total = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; ; i++) {
            System.out.print("Bir sayi giriniz: ");
            kullaniciSayisi = scan.nextInt();

            if (!(kullaniciSayisi % 4 == 0)) {
              total+=kullaniciSayisi;
              break;

            }else {
              continue;
            }
        }
        System.out.println("Toplam: " + total);
    }
}
