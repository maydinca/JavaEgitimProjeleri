import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        int number;
        Scanner scan=new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        number=scan.nextInt();
        double result=0.0;
        for (int i=1;i<=number; i++){
            result+=(1.0/i);
        }
        System.out.print("Harmonik sayı: "+result);
    }
}
