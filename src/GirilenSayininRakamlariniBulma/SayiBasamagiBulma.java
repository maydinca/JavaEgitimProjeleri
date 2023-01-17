package GirilenSayininRakamlariniBulma;

import java.util.Scanner;

public class SayiBasamagiBulma {
    public static void main(String[] args) {
        int girilenSayi,counter=0,uzunluk = 0;

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin!");
        girilenSayi=scan.nextInt();

//        for (int i = girilenSayi; i > 0; i /= 10) {
//            uzunluk++;
//            counter++;
//        }
//        System.out.println("Sayinin Basamak Sayisi :"+counter);
//        System.out.println("Girilen Sayi "+ uzunluk+ " basamaklidir.");

        //2. Method
        while(girilenSayi > 0) {
            girilenSayi /= 10;
            uzunluk++;
        }

        System.out.println("Sayının uzunluğu: " + uzunluk);
    }
}
