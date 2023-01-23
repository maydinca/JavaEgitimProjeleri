package YildizlarIleUcgen;

import java.util.Scanner;
public class ElmasYapimi2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int satir;
        String bosluk =" ";
        String sekil = "*";

        System.out.print("Lutfen Bir sayı giriniz :");
        satir=scan.nextInt();

        for(int i=1;i<=satir;i++){

            for(int k=satir-1;i<=k;k--){
                System.out.print(bosluk);
            }
            for(int n=1;n<=2*i-1;n++){
                System.out.print(sekil);
            }
            for(int k=satir-1;i<=k;k--){
                System.out.print(bosluk);
            }
            System.out.println();
        }

        for(int i=satir;i>1;i--){

            for(int k=satir-i+1;k>=1;k--){
                System.out.print(bosluk);
            }
            for(int n=1;n<=2*i-3;n++){
                System.out.print(sekil);
            }
            for(int k=satir-i+1;k>=1;k--){
                System.out.print(bosluk);
            }
            System.out.println();
        }
    }
}
