import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DortveBesinKuvvetiniBulma {
    /*
    Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
     */
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        n = scan.nextInt();

        List<Integer> dordeBolunenSayilar = new ArrayList<>();
        List<Integer> beseBolunenSayilar = new ArrayList<>();

        for (int i = 4; i <= n; i *= 4){
            dordeBolunenSayilar.add(i);
        }
        System.out.println(dordeBolunenSayilar);

        System.out.println("Girilen sayıya kadar 5' in kuvvetleri : ");
        for(int j = 5; j <= n; j*=5){
            beseBolunenSayilar.add(j);
        }
        System.out.println(beseBolunenSayilar);
    }
}
