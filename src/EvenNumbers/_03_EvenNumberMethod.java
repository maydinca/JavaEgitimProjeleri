package EvenNumbers;
import java.util.Scanner;
public class _03_EvenNumberMethod {
    public static void main(String[] args) {
        int number, i,ortalama;
        int toplam = 0, sayac = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir tam sayi giriniz! ");
        number = scanner.nextInt();

        for (i = 1; i < number; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                sayac++;
                System.out.println(i);
            }
        }
        ortalama = toplam / sayac;
        System.out.println("Ortalama: " + ortalama);
    }
}
