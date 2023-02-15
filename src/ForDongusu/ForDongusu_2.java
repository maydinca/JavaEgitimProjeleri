package ForDongusu;

import java.util.Scanner;

public class ForDongusu_2 {
    public static void main(String[] args) {
        int sayi;

        Scanner scan = new Scanner(System.in);
//      Method1
//        for (boolean run = true; run; ) {
//            System.out.println("sayi giriniz");
//            sayi = scan.nextInt();
//            if (sayi < 0) {
//                run = false;
//            }
//        }
        System.out.println("sayi giriniz : ");
        sayi=scan.nextInt();
//        Method2
//        while (sayi>0){
//            System.out.println("sayi giriniz : ");
//            sayi = scan.nextInt();
//        }
//        Method3
        do{
            System.out.println("sayi giriniz : ");
            sayi = scan.nextInt();
        }while (sayi>0);

    }
}