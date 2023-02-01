package MukemmelSayi;

import java.util.Scanner;

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
