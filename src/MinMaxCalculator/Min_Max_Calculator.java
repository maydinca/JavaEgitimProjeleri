package MinMaxCalculator;
import java.util.Scanner;

public class Min_Max_Calculator {
    public static void main(String[] args) {

        int n,max=1,min=1,number;
        Scanner scan=new Scanner(System.in);
        System.out.print("How many number do you want to enter?:");
        n=scan.nextInt();

        for (int i=1; i<=n; i++){
            System.out.print(i+". Please enter number:");
            number=scan.nextInt();
            if (i==1){
                max=number;
                min=number;
            }else if (number>max){
                max=number;
            } else if (number<min) {
                min=number;
            }
        }
        System.out.println("Max Number :"+max);
        System.out.print("Min Number:"+min);
    }
}
