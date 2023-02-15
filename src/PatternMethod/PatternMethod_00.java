package PatternMethod;

import java.util.Scanner;

public class PatternMethod_00 {
    // Kullanıcı girdilerini okumak için Scanner sınıfından bir nesne oluşturuyoruz
    public static Scanner scanner = new Scanner(System.in);


    static int patternRule(int number, int tempNumber, int stop) { // Verilen kuralla uygun bir sayı deseni yazdıran özyinelemeli fonksiyon

        if (number > 0) { // Eğer mevcut sayı 0'dan büyükse, sayıyı yazdır ve bir sonraki sayıyla patternRule fonksiyonunu özyinelemeli olarak çağır
            System.out.print(number + " ");
            return patternRule(number - 5, tempNumber - 5, stop);
        }
        // Eğer mevcut sayı durdurma değerinden küçük veya eşitse, sayıyı yazdır ve bir sonraki sayıyla patternRule fonksiyonunu özyinelemeli olarak çağır
        if (tempNumber <= stop) {
            System.out.print(tempNumber + " ");
            return patternRule(number, tempNumber + 5, stop);
        }
        // Yukarıdaki iki koşul karşılanmadığında, fonksiyondan çıkmak için durdurma değerini döndür
        return stop;
    }

    public static void main(String[] args) {
        int number;
        // Kullanıcı sıfır veya negatif bir sayı girene kadar, pozitif bir sayı girmeleri için çağrı yapıyoruz
        do {
            System.out.print("Pozitif bir sayı girin: ");
            number = scanner.nextInt();
            // patternRule fonksiyonunu girdi sayısı ile çağır ve elde edilen deseni yeni bir satıra yazdır
            patternRule(number, number, number);
            System.out.println();
        } while (number > 0);
    }
}


