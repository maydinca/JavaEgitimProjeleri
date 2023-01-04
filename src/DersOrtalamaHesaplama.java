import java.util.Scanner;

public class DersOrtalamaHesaplama {
    public static void main(String[] args) {
        int matematik, fizik, kimya,turkce,tarih,muzik;

        Scanner scn=new Scanner(System.in);
        System.out.println("Matematik notunu gir!");
        matematik=scn.nextInt();

        System.out.println("fizik notunu gir!");
        fizik=scn.nextInt();

        System.out.println("Kimya notunu gir!");
        kimya=scn.nextInt();

        System.out.println("turkce notunu gir!");
        turkce=scn.nextInt();

        System.out.println("tarih notunu gir!");
        tarih=scn.nextInt();

        System.out.println("muzik notunu gir!");
        muzik=scn.nextInt();

        int toplam=(matematik+fizik+kimya+turkce+tarih+muzik);
        double avg=toplam/6;

        System.out.println("ortalama :"+avg);
        String durum= avg>=60 ? "gecti" : "kaldi";
        System.out.println("Dersten :"+durum);

    }
}
