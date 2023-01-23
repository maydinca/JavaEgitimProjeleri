package YildizlarIleUcgen;

import java.util.Scanner;

public class Elmas4 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        int elmassinir;
        System.out.println("Kac satirlik elmas istiyorsunuz? : ");
        elmassinir = oku.nextInt();

        int satir=0,cizim=0;
        while(satir < elmassinir)
        {
            for(int k=0;k<(elmassinir-satir);k++)
                System.out.print(" ");
            for(int i=1; i < satir;i++)
                System.out.print("*");
            for(int i=1; i < satir;i++)
                System.out.print("*");
            System.out.print("\n");
            satir++;
        }

        while(satir > 0)
        {
            for(int k=0;k<(elmassinir-satir);k++)
                System.out.print(" ");
            for(int i=satir; i > 1;i--)
                System.out.print("*");
            for(int i=satir; i > 1;i--)
                System.out.print("*");
            System.out.print("\n");
            satir--;
        }
    }
}
