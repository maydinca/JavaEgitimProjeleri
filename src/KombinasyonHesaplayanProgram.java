import java.util.Scanner;
public class KombinasyonHesaplayanProgram {
    /*
    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu
    olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
    Java ile kombinasyon hesaplayan program yazınız.

    Kombinasyon formülü
    C(n,r) = n! / (r! * (n-r)!)
     */
    public static void main(String[] args) {
        int n, r, kombinasyon,faktorielN = 1, factorielR = 1, factorielNR = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kombinasyonu alınacak sayıyı giriniz: "); n = input.nextInt();
        System.out.print("Lütfen kaçlı kombinasyonunu almak istiyorsanız sayıyı giriniz: "); r = input.nextInt();

        for (int i = 1; i <= n; i++){   // n sayısının faktöriyeli.
            faktorielN *= i;
        }

        for (int i = 1; i <= r; i++){   // r sayısının faktöriyeli.
            factorielR *= i;
        }

        for (int i = 1; i <= (n-r); i++){   // (n-r) nin faktöriyeli.
            factorielNR *= i;
        }
        kombinasyon = faktorielN/(factorielR*factorielNR); // C(n,r) = n! / (r! * (n-r)!)
        System.out.print("Kombinasyon = " + kombinasyon);
    }
}
