import java.util.Scanner;

public class KdvHesaplamaProgram {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Urun tutarini giriniz!");
        double urunfiyati = scn.nextDouble();

        double kdvOrani1 = 0.18;
        double odenecekKdvTutari1 = urunfiyati * kdvOrani1;
        double kdvOrani2 = 0.08;
        double odenecekKdvTutari2 = urunfiyati * kdvOrani2;

        double urunToplamFiyati1 = urunfiyati+odenecekKdvTutari1;
        double urunToplamFiyati2 = urunfiyati+odenecekKdvTutari2;

        if (urunfiyati > 0 && urunfiyati <= 1000) {
            System.out.println("urunfiyati  ==> "+urunfiyati + " TL"+
                    "\nOdenecek KDV ==>"+"% "+kdvOrani1+
                    "\nOdenecek KDV Tutari==>"+odenecekKdvTutari1+ "TL"+
                    "\nOdenecek Toplam Fiyat==>"+urunToplamFiyati1+" Tl dir.");

        } else if (urunfiyati > 1000) {
            System.out.println("urunfiyati  ==> "+urunfiyati + " TL"+
                    "\nOdenecek KDV ==>"+"% "+kdvOrani2+
                    "\nOdenecek KDV Tutari==>"+odenecekKdvTutari2+ "TL"+
                    "\nOdenecek Toplam Fiyat==>"+urunToplamFiyati2+" Tl dir.");

        } else {
            System.out.println("Girilen deger gecersizdir!");
        }
    }
}

