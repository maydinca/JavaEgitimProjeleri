package CinZindakBurcHesaplama;

import java.util.Scanner;

public class CinZindakBurcHesaplama {
    /**
     * Çin Zodyağı nedir?
     *
     * 4000 bin dogumYilidır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle
     * tanımlar.
     *
     * Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır
     * ve dogumYilidızlarla pek bir ilgisi yoktur.
     *
     * Çin Zodyağı nasıl hesaplanır?
     *
     * Çin zodyağı hesaplanırken kişinin doğum dogumYiliının 12 ile bölümünde kalana göre bulunur.
     *
     * Doğum Tarihi %12 = 0 ➜ Maymun
     *
     * Doğum Tarihi %12 = 1 ➜ Horoz
     *
     * Doğum Tarihi %12 = 2 ➜ Köpek
     *
     * Doğum Tarihi %12 = 3 ➜ Domuz
     *
     * Doğum Tarihi %12 = 4 ➜ Fare
     *
     * Doğum Tarihi %12 = 5 ➜ Öküz
     *
     * Doğum Tarihi %12 = 6 ➜ Kaplan
     *
     * Doğum Tarihi %12 = 7 ➜ Tavşan
     *
     * Doğum Tarihi %12 = 8 ➜ Ejderha
     *
     * Doğum Tarihi %12 = 9 ➜ dogumYilian
     *
     * Doğum Tarihi %12 = 10 ➜ At
     *
     * Doğum Tarihi %12 = 11 ➜ Koyun
     *
     * Senaryo
     *
     * @param args
     */

    public static void main(String[] args) {
        int dogumYili, zodyakHesab;
        String zodyak = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum dogumYiliınızı Giriniz:");
        dogumYili = scanner.nextInt();
        zodyakHesab = dogumYili % 12;

        switch (zodyakHesab) {

            case 0:
                zodyak = "Maymun";
                System.out.println("Çin Zodyağına gore Burcunuz: " + zodyak);
                break;
            case 1:
                zodyak = "Horoz";
                System.out.println("Çin Zodyağına gore Burcunuz: " + zodyak);
                break;
            case 2:
                zodyak = "Köpek";
                System.out.println("Çin Zodyağına gore Burcunuz: " + zodyak);
                break;
            case 3:
                zodyak = "Domuz";
                System.out.println("Çin Zodyağına gore Burcunuz: " + zodyak);
                break;
            case 4:
                zodyak = "Fare";
                System.out.println("Çin Zodyağına gore Burcunuz: " + zodyak);
                break;
            case 5:
                zodyak = "Öküz";
                System.out.println("Çin Zodyağına gore Burcunuz: " + zodyak);
                break;
            case 6:
                zodyak = "Kaplan";
                System.out.println("Çin Zodyağına gore Burcunuz: " + zodyak);
                break;
            case 7:
                zodyak = "Tavşan";
                System.out.println("Çin Zodyağına gore Burcunuz: " + zodyak);
                break;
            case 8:
                zodyak = "Ejderha";
                System.out.println("Çin Zodyağına gore Burcunuz: " + zodyak);
                break;
            case 9:
                zodyak = "dogumYilian";
                System.out.println("Çin Zodyağına gore Burcunuz:" + zodyak);
                break;
            case 10:
                zodyak = "At";
                System.out.println("Çin Zodyağına gore Burcunuz:" + zodyak);
                break;
            case 11:
                zodyak = "Koyun";
                System.out.println("Çin Zodyağına gore Burcunuz: " + zodyak);
                break;
            default:
                System.out.println("Hatali giris yaptiniz... Lütfen tekrar deneyiniz!");
        }
    }
}

