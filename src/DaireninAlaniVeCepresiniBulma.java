import java.util.Scanner;

public class DaireninAlaniVeCepresiniBulma {
    /*
    Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
     */
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Dairenin yari capini giriniz");
        int daireninYariCapi=scn.nextInt();

        double pi=3.14;
        double daireninAlani,daireninCevresi;

        daireninAlani=pi*daireninYariCapi*daireninYariCapi;
        daireninCevresi=2*pi*daireninYariCapi;

        System.out.println("Dairenin Alani : "+daireninAlani+
                           "\nDairenin Cevresi :"+daireninCevresi);

    }
}
