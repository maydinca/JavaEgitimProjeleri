package PatternMethod;
import java.util.Scanner;

/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
11
6
1
-4
*/


public class PatternMethod_01 {
    static void printPattern(int number, int target) {
        int currentNumber = number;
        System.out.println(currentNumber);  // Mevcut sayıyı ekrana yazdır

        if (currentNumber > 0) {  // Mevcut sayı 0'dan büyükse
            currentNumber -= 5;
            printPattern(currentNumber, target);  // 5 azaltarak deseni devam ettir
        } else {  // Mevcut sayı 0 veya daha küçükse
            printPatternPlus(currentNumber, target);  // Artırarak deseni tamamla
        }
    }

    static void printPatternPlus(int currentNumber, int target) {
        int nextNumber = currentNumber + 5;

        if (nextNumber <= target) {  // Mevcut sayı hedef sayıya eşit veya daha küçükse
            System.out.println(nextNumber);  // Mevcut sayıyı ekrana yazdır
            printPatternPlus(nextNumber, target);  // 5 artırarak deseni devam ettir
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        int number = scanner.nextInt();  // Kullanıcıdan bir sayı girmesini iste
        int target = number;
        printPattern(number, target);  // Deseni oluşturmak için metodu çağır
    }
}

