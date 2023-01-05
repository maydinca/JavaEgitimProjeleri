import java.util.Scanner;

public class HipatenusBulma {
    public static void main(String[] args) {
        int a, b, c = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Hipatenus icin a kenari uzunlugunu girin");
        a = scan.nextInt();
        System.out.println("Hipatenus icin b kenari uzunlugunu girin");
        b = scan.nextInt();

        int hipatenus = (int) Math.sqrt((a * a) + (b * b));
        System.out.println("c nin uzunlugu  = " + hipatenus);
    }
}
