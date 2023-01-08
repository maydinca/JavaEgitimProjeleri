import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
 */

        double kmp=2.20, minTutar=20,taksimetreAcilis=10;


        Scanner scn=new Scanner(System.in);
        System.out.println("Lutfen gidilen mesafeyi km cinsinden giriniz!");
        double gidilenYol= scn.nextDouble();

        double gidilenMesafeUcreti=(kmp*gidilenYol);
        double odenecektutar=gidilenMesafeUcreti+taksimetreAcilis;
        double odenecekToplamTutar=(odenecektutar<=20)?minTutar:odenecektutar;

        System.out.println("Odenecek Toplam Tutar :"+odenecekToplamTutar+ " Tl dir.");

        System.out.println("****************2.yol********");

        double total=(kmp*gidilenYol);
        total+=taksimetreAcilis;

        total=(total<20)?minTutar:total;
        System.out.println("Odenecek Toplam Tutar :"+total+ " Tl dir.");




    }
}
