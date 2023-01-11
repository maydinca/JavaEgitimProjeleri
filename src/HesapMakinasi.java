import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        double sayi1,sayi2;
        int islemSecimi;
        Scanner scan=new Scanner(System.in);
        System.out.println("Yapmak istediginiz islem icin 1. sayiyi giriniz!");
        sayi1= scan.nextDouble();
        System.out.println("Yapmak istediginiz islem icin 2. sayiyi giriniz!");
        sayi2= scan.nextDouble();

        System.out.print("Lutfen yapmak istediginiz islemi seciniz :"+
                "\nCarma islemi icin :" +1+"\nBolme islemi icin :"+
                "\nToplama islemi icin :"+ 3+"\nCikarma islemi icin :"+4+ " e basiniz...");
        islemSecimi=scan.nextInt();

        switch(islemSecimi){
            case 1:
                System.out.println("SadogumYiliarin Carpim Sonucu :"+(sayi1 * sayi2));
                break;
            case 2:
                System.out.println("SadogumYiliarin Bolum Sonucu :"+(sayi1 / sayi2));
                break;
            case 3:
                System.out.println("SadogumYiliarin Toplam Sonucu :"+(sayi1 + sayi2));
                break;
            case 4:
                System.out.println("SadogumYiliarin Cikarma Sonucu :"+(sayi1 - sayi2));
                break;
            default:
                System.out.println("Hatali islem girisi yaptiniz,Tekrar deneyiniz.");
        }

    }
}
