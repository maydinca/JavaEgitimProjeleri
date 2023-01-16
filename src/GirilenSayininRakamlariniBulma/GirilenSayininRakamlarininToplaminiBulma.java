package GirilenSayininRakamlariniBulma;

import java.util.Scanner;

public class GirilenSayininRakamlarininToplaminiBulma {
    public static void main(String[] args) {
        int girilenSayi,uzunluk = 0;
        int rakamlarToplami=0;

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin!");
        girilenSayi=scan.nextInt();

        for (int i = girilenSayi; i > 0; i /= 10) {
            int rakam= i % 10;
            rakamlarToplami+=rakam;
            uzunluk++;
        }
        System.out.println("Girilen sayinin Rakamlari Toplami : "+rakamlarToplami);
        System.out.println("Girilen Sayi "+ uzunluk+ " basamaklidir.");
    }
}
