package YildizlarIleUcgen;
import java.util.Scanner;
public class ReverseTriangle {
    public static void main(String[] args) {

        /** Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*)
         * ile ekrana ters üçgen çizen programı yazın.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("How many rows do you want to make a triangle?:");
        int sayi=scan.nextInt();

        for (int i=sayi; i >0 ; i--){

            for (int k=sayi-i; k>0; k--){
                System.out.print(" ");
            }
            for (int j=(2*i)-1; j>0; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
