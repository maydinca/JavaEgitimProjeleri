import java.util.Scanner;

public class NumberSort {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen a nin degeri icin bir tam sayi girin");
        a = scan.nextInt();
        System.out.println("Lutfen b nin degeri icin bir tam sayi girin");
        b = scan.nextInt();
        System.out.println("Lutfen c nin degeri icin bir tam sayi girin");
        c = scan.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a,b,c nin siralamasi = " + "a>b>c");
            } else {
                System.out.println("a,b,c nin siralamasi = " + "a>c>b");
            }
        } else if ((b > a) && (b > c)) {
            if (c > a) {
                System.out.println("a,b,c nin siralamasi = " + "b>c>a");
            } else {
                System.out.println("a,b,c nin siralamasi = " + "b>a>c");
            }
        } else {
            if (a > b) {
                System.out.println("a,b,c nin siralamasi = " + "c>a>b");
            } else {
                System.out.println("a,b,c nin siralamasi = " + "c>b>a");
            }
        }
    }
}

