import java.util.Scanner;

public class UcakBiletiFiyatHesaplama {
    /*
     Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
     Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
     Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre
     müşteriye aşağıdaki indirimleri uygulayın ;

     Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
     Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

       Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
          Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
             Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
                Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

      */
    public static void main(String[] args) {
        int mesafe,yas,seyahatTipi = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Gideceğiniz Mesafeyi Km Cinsinden Giriniz : ");
        mesafe = scan.nextInt();

        System.out.println("Lütfen Yaşınızı Giriniz : ");
        yas= scan.nextInt();

        System.out.println("Yolculuk Tipinizi Giriniz : (Tek Yön: 1 , Gidiş-Dönüş 2 ");
        seyahatTipi = scan.nextInt();

        if(yas<=0 || mesafe<=0
                  || (seyahatTipi !=1
                  && seyahatTipi !=2)){
            System.out.println("Girdinginiz Veriler Hatalidir Tekrar Deneyin ");
            return;

        }

        double biletFiyati = mesafe*0.10;

        if(yas <12){
            biletFiyati *= 0.50;
        } else if (yas >=12 && yas <=24) {
            biletFiyati *=0.90;
        }else if(yas > 65){
            biletFiyati *=0.70;

        }

        if(seyahatTipi ==2){
            biletFiyati *=0.80;
        }
        System.out.println("Bilet Fiyatınız : " + biletFiyati + " TL");

    }
}