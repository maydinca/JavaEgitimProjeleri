package MukemmelSayi;

import java.util.Scanner;
/*
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

Senaryolar
Bir sayı giriniz: 28
28 Mükemmel sayıdır
Bir sayı giriniz: 1
1 Mükemmel sayı değildir.
Bir sayı giriniz: 496
496 Mükemmel sayıdır

 */
public class MukemmelSayi {
    public static void main(String[]args){
        int number,i=1,sum=0,j;
        Scanner input=new Scanner(System.in);
        while (i<2){
            System.out.print("Bir sayı giriniz: ");
            number=input.nextInt();
            for (j=1; j<number; j++){
                if (number%j==0){
                    sum+=j;
                }
            }
            if (number==sum){
                System.out.println(number+" Mükemmel sayıdır");
            }else{
                System.out.println(number+" Mükemmel sayı değildir");
            }
            sum=0;
        }
    }
}
