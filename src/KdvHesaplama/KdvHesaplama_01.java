package KdvHesaplama;

import java.util.Scanner;

public class KdvHesaplama_01 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Urun Fiyatini girin!");

        double urunfiyati=scn.nextDouble();
        double kdvOrani=0.18;
        double odenecekKdvTutari=urunfiyati*kdvOrani;

        double urunToplamFiyati=urunfiyati+odenecekKdvTutari;

        System.out.println("urunfiyati  ==> "+urunfiyati +
                "\nOdenecek KDV ==>"+kdvOrani+
                "\nOdenecek KDV Tutari ==> "+odenecekKdvTutari+
                "\nOdenecek Toplam Fiyat ==> "+urunToplamFiyati+" Tl dir.");
    }
}
