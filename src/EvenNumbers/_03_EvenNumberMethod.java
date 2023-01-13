package EvenNumbers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class _03_EvenNumberMethod {

    /*
    Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
     ortalamasını hesaplayan programı yazınız.
     */
    public static void main(String[] args) {
        int girilenSayi, i,ortalama;
        int toplam = 0, sayac = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen bir tam sayi giriniz! ");
        girilenSayi = scan.nextInt();

        List<Integer> list = new ArrayList<>();
        for (i = 0; i < girilenSayi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                sayac++;
                list.add(i);
            }
        }
        ortalama = toplam / sayac;
        System.out.println("3 ve 4 e tam bulunen sayilar : "+list+"" +
                           "\nbu sayilarin Ortalamasi = "+ortalama);
    }
}
