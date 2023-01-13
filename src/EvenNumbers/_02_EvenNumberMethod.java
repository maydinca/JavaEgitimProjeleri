package EvenNumbers;

import java.util.Scanner;

public class _02_EvenNumberMethod {
    public static void main(String[] args) {
        int number, i = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir tam sayi giriniz! ");
        number = scanner.nextInt();
        System.out.println("Cift Sayilar ");

        while (i < number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
