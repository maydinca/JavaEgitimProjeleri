package RecursivePrime;

import java.util.Scanner;
/*
--if (num <= 2) { return (num == 2); } kodu, 2'den küçük sayıların asal olup olmadığını kontrol eder.
Eğer sayı 2'ye eşit ise, sayı asal sayıdır. Eğer sayı 2'den küçük veya 2'ye eşit değilse, sayı asal değildir.

-- if (num % i == 0) { return false; } kodu, sayının i'ye bölünüp bölünemeyeceğini kontrol eder.
 Eğer sayı i'ye bölünürse, sayı asal değildir.

--if (i * i > num) { return true; } kodu, i'nin karesinin, sayıdan büyük olup olmadığını kontrol eder.
Eğer i'nin karesi sayıdan büyükse, sayı asal sayıdır.

return isPrime(num, i + 1); kodu, sayının diğer bölenlerini kontrol etmek için isPrime metodunu kendisiyle tekrar çağırır.
Bu kod, sonuç olarak bir true veya false döndürür.
 */
public class isPrime_00 {
    public static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Sayıyı girin: ");
        int num = userInput.nextInt();

        if (isPrime(num, 2)) {
            System.out.println(num + " asal sayıdır.");
        } else {
            System.out.println(num + " asal sayı değildir.");
        }
    }

    public static boolean isPrime(int num, int i) {
        if (num <= 2) {
            return (num == 2);
        }
        if (num % i == 0) {
            return false;
        }
        if (i * i > num) {
            return true;
        }
        return isPrime(num, i + 1);
    }
}

