package EbobEkok;

import java.util.Scanner;

public class _01_EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter n1:");
        int n1 = input.nextInt();

        System.out.print("enter n2:");
        int n2 = input.nextInt();
        int ebob=0;

        int i= 1;
        while(i<=n1){
            if(n1%i==0 & n2%i==0){
                ebob=i;
            }
            i++;
        }
        int ekok=(n1*n2)/ebob;
        System.out.println("ebob:"+ebob+"\nekok:"+ekok);
    }
}
