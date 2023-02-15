package BurcBulma;

import java.util.Scanner;

/**
 * Koç Burcu : 21 Mart - 20 Nisan
 *
 * Boğa Burcu : 21 Nisan - 21 Mayıs
 *
 * İkizler Burcu : 22 Mayıs - 22 Haziran
 *
 * Yengeç Burcu : 23 Haziran - 22 Temmuz
 *
 * Aslan Burcu : 23 Temmuz - 22 Ağustos
 *
 * Başak Burcu : 23 Ağustos - 22 Eylül
 *
 * Terazi Burcu : 23 Eylül - 22 Ekim
 *
 * Akrep Burcu : 23 Ekim - 21 Kasım
 *
 * Yay Burcu : 22 Kasım - 21 Aralık
 *
 * Oğlak Burcu : 22 Aralık - 21 Ocak
 *
 * Kova Burcu : 22 Ocak - 19 Şubat
 *
 * Balık Burcu : 20 Şubat - 20 Mart
 *
 * Ödev
 * Aynı örneği switch-case kullanmadan yapınız.
 */
public class BurcBulma {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        Scanner scanut = new Scanner(System.in);
        System.out.print("Doğduğunuz ay:");
        month = scanut.nextInt();

        System.out.print("Doğduğunuz gün:");
        day = scanut.nextInt();

        if (month == 1) {
            if ((day >= 1) && (day <= 31)) {
                if (day <= 21) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
                System.out.println( "Burcunuz :" + burc);
            }else
                System.out.println("Hatalı gün girdiniz!");
        }
        if(month == 2){
            if ((day >= 1) && (day <= 28)) {
                if (day <= 19) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
                System.out.println( "Burcunuz :" + burc);
            }else
                System.out.println("Hatalı gün girdiniz!");
        }
        if(month == 3){
            if ((day >= 1) && (day <= 31)) {
                if (day <= 20) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
                System.out.println( "Burcunuz :" + burc);
            }else
                System.out.println("Hatalı gün girdiniz!");
        }
        if(month == 4){
            if ((day >= 1) && (day <= 30)) {
                if (day <= 20) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
                System.out.println( "Burcunuz :" + burc);
            }else
                System.out.println("Hatalı gün girdiniz!");
        }
        if(month == 5){
            if ((day >= 1) && (day <= 31)) {
                if (day <= 21) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
                System.out.println( "Burcunuz :" + burc);
            }else
                System.out.println("Hatalı gün girdiniz!");
        }
        if(month == 6){
            if ((day >= 1) && (day <= 30)) {
                if (day <= 21) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
                System.out.println( "Burcunuz :" + burc);
            }else
                System.out.println("Hatalı gün girdiniz!");
        }
        if(month == 7){
            if ((day >= 1) && (day <= 31)) {
                if (day <= 22) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
                System.out.println( "Burcunuz :" + burc);
            }else
                System.out.println("Hatalı gün girdiniz!");
        }
        if(month == 8){
            if ((day >= 1) && (day <= 31)) {
                if (day <= 22) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
                System.out.println( "Burcunuz :" + burc);
            }else
                System.out.println("Hatalı gün girdiniz!");
        }
        if(month == 9){
            if ((day >= 1) && (day <= 30)) {
                if (day <= 22) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
                System.out.println( "Burcunuz :" + burc);
            }else
                System.out.println("Hatalı gün girdiniz!");
        }
        if(month == 10){
            if ((day >= 1) && (day <= 31)) {
                if (day <= 22) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
                System.out.println( "Burcunuz :" + burc);
            }else
                System.out.println("Hatalı gün girdiniz!");
        }
        if(month == 11){
            if ((day >= 1) && (day <= 30)) {
                if (day <= 21) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
                System.out.println( "Burcunuz :" + burc);
            }else
                System.out.println("Hatalı gün girdiniz!");
        }
        if(month == 12){
            if ((day >= 1) && (day <= 31)) {
                if (day <= 21) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
                System.out.println( "Burcunuz :" + burc);
            }else
                System.out.println("Hatalı gün girdiniz!");
        }
    }
}
