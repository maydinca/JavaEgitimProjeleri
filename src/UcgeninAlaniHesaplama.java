import java.util.Scanner;

public class UcgeninAlaniHesaplama {
    /*
    Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
     𝑢 = (a+b+c) / 2

    Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
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
