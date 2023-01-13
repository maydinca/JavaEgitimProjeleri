package EvenNumbers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class _01_EvenNumbers {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir tam sayi giriniz! ");
       int number = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (i = 1; i < number; i++) {
            if (i % 2 == 0) {
                list.add(i);
            i++;
            }
        }
        System.out.print("Girdiginiz sayiya kadar olan cift sayilar : "+list );
    }
}
