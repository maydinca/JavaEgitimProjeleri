import java.util.Scanner;

public class UcgeninAlaniHesaplama {
    /*
    รรง๐๐๐๐๐ รง๐๐ฃ๐๐๐ ๐ = 2๐ข
     ๐ข = (a+b+c) / 2

    Alan * Alan = ๐ข * (๐ข โ ๐)* (๐ข โ ๐) * (๐ข โ ๐)
     */

    public static void main(String[] args) {
        int a, b, c = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Hipatenus icin a kenari uzunlugunu girin!");
        a = scan.nextInt();
        System.out.println("Hipatenus icin b kenari uzunlugunu girin!");
        b = scan.nextInt();
        System.out.println("Hipatenus icin c kenari uzunlugunu girin!");
        c = scan.nextInt();

        int u=(a+b+c)/2;
        int ucgenCevresi=u*2;
        int ucgeninAlani=(int) Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("ucgeninAlani = " + ucgeninAlani+
                          "\nUcgenin Cevresi :"+ucgenCevresi);
    }
}
