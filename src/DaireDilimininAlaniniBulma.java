import java.util.Scanner;

public class DaireDilimininAlaniniBulma {

    /*
    Ödev
    Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

    𝜋 sayısını = 3.14 alınız.

    Formül : (𝜋 * (r*r) * 𝛼) / 360
     */

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Merkez aci olcusunu giriniz!");
        int merkezaciolcusu=scn.nextInt();
        System.out.println("Lutfen yaricapi giriniz!");
        int daireninYariCapi= scn.nextInt();

        double pi=3.14;
        double daireninAlani=(pi*(daireninYariCapi*daireninYariCapi)*merkezaciolcusu)/360;

        System.out.println("Dairenin Alani : "+daireninAlani);


    }

}
