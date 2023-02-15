package ManavKasaProgrami;

import java.util.Scanner;

public class ManavKasaProgrami {
    /*
    Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
     */
    public static void main(String[] args) {
        Scanner mnv = new Scanner(System.in);

        double armut =2.14,elma = 3.67,domates =1.11,muz =0.95,patlican =5.00;

        System.out.print("Armut kaç kilo? :");
        double armutKilo = mnv.nextDouble();
        System.out.print("Elma kaç kilo? :");
        double elmaKilo = mnv.nextDouble();
        System.out.print("Domates kaç kilo? :");
        double domatesKilo = mnv.nextDouble();
        System.out.print("Muz kaç kilo? :");
        double muzKilo = mnv.nextDouble();
        System.out.print("Patlican kaç kilo :");
        double patlicanKilo = mnv.nextDouble();
        double toplam =(armut*armutKilo)+(elma*elmaKilo)+ (domates*domatesKilo)+(muz*muzKilo)+(patlican*patlicanKilo);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Satin Alinan Armutun Toplam Fiyati: "+(armut*armutKilo)+
                "\nSatin Alinan Elmanin Toplam Fiyati :"+(elma*elmaKilo)+
                "\nSatin Alinan Domatesin Toplam Fiyati :"+(domates*domatesKilo)+
                "\nSatin Alinan Muzun Toplam Fiyati :"+(muz*muzKilo)+
                "\nSatin Alinan Patlicanin Toplam Fiyati :"+(patlican*patlicanKilo+
                "\nOdenecek Toplam Tutar :" +toplam + "Tl dir."));


    }

}
