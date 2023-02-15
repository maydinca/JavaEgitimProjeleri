package VücutKitleIndeksiHesaplama;

import java.util.Scanner;
/*
   Vücut Kitle İndeksi Hesaplama

   Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
   Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

   Formül
   Kilo (kg) / Boy(m) * Boy(m)

   Çıktısı
   Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
   Lütfen kilonuzu giriniz : 105
   Vücut Kitle İndeksiniz : 35.49215792320173

    */
public class VücutKitleIndeksiHesaplama {

    public static void main(String[] args) {
        Scanner snc=new Scanner(System.in);
        System.out.println("Lutfen Vucut Kitle Index Hesabi icin Kilonunuzu Kg Cinsinden Giriniz!");
        double kullaniciKilosu=snc.nextDouble();
        System.out.println("Lutfen Vucut Kitle Index Hesabi icin Boyunuzu Metre Cinsinden Giriniz!");
        double kullaniciBoyu=snc.nextDouble();

        double vucutKitleIndexi= (kullaniciKilosu/(kullaniciBoyu*kullaniciBoyu));
        System.out.println("Vucut kile Indexiniz: " +vucutKitleIndexi);
    }
}
