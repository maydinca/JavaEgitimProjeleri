package DonemSonuOrtalamaHesaplama;

import java.util.Scanner;

public class DonemSonuOrtalamaHesaplama {
    /*
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */
    public static void main(String[] args) {
        double matematik,fizik,turkce,kimya,muzik;
        double dersNotePuanToplam=0,dersNotePuanOrtalama=0;
        int ortalamayaEklenecekDersSayisi=0;

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen Matematik Notunuzu Giriniz!");
        matematik=scan.nextDouble();


        if ((matematik>0) && (matematik<=100)){
            dersNotePuanToplam+=matematik;
            System.out.println("Matematik Ders Notunuz Ortalamaniza eklendi  : "+ dersNotePuanToplam);
            ortalamayaEklenecekDersSayisi++;
        }
        System.out.println("Lutfen fizik Notunuzu Giriniz!");
        fizik=scan.nextDouble();
        if ((fizik>0) && (fizik<=100)){
            dersNotePuanToplam+=fizik;
            System.out.println("Matematik Ders Notunuz Ortalamaniza eklendi  : "+ dersNotePuanToplam);
            ortalamayaEklenecekDersSayisi++;
        }
        System.out.println("Lutfen turkce Notunuzu Giriniz!");
        turkce=scan.nextDouble();
        if (turkce>0 && turkce<=100){
            dersNotePuanToplam+=turkce;
            System.out.println("Matematik Ders Notunuz Ortalamaniza eklendi  : "+ dersNotePuanToplam);
            ortalamayaEklenecekDersSayisi++;
        }
        System.out.println("Lutfen kimya Notunuzu Giriniz!");
        kimya= scan.nextDouble();
        if (kimya>0 && kimya<=100){
            dersNotePuanToplam+=kimya;
            System.out.println("Matematik Ders Notunuz Ortalamaniza eklendi  : "+ dersNotePuanToplam);
            ortalamayaEklenecekDersSayisi++;
        }
        System.out.println("Lutfen muzik Notunuzu Giriniz!");
        muzik= scan.nextDouble();
        if (muzik>0 && muzik<=100){
            dersNotePuanToplam+=muzik;
            System.out.println("Matematik Ders Notunuz Ortalamaniza eklendi  : "+ dersNotePuanToplam);
            ortalamayaEklenecekDersSayisi++;
        }
        dersNotePuanOrtalama=(dersNotePuanToplam/ortalamayaEklenecekDersSayisi);
        System.out.println("Ders Ortamalaniz  = " +dersNotePuanOrtalama);

        if (dersNotePuanOrtalama>=55){
            System.out.println("Sinifi " + dersNotePuanOrtalama + " ile gectiniz...");

        }else {
            System.out.println("Ders Ortalamaniz "+dersNotePuanOrtalama+" ile sinif tekrari yapmaniz gerekmekte");
        }

    }
}
