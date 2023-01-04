import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Urun Fiyatini girin!");

        double urunfiyati=scn.nextDouble();
        double kdvOrani=0.18;
        double odenecekKdvTutari=urunfiyati*kdvOrani;

        double urunToplamFiyati=urunfiyati+odenecekKdvTutari;


        System.out.println("urunfiyati  ==> "+urunfiyati +" \nodenecek kdv tutari==>"+odenecekKdvTutari+ "\nodenecek toplam fiyat==>"+urunToplamFiyati+" Tl");


    }


}
