package EvenOdd;

import java.util.Scanner;

public class EvenOdd_00 {
    /*
    Task
Given an integer, perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of 2 to 5, print Not Weird
If  is even and in the inclusive range of 6  to 20 , print Weird
If  is even and greater than 20 , print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String response="";

        if(n%2==1){
            response = "Weird";
        }
        else {
            if (n >= 2 && n <= 5) {
                response = "Not Weird";
            } else if (n >= 6 && n <= 20) {
                response = "Weird";
            } else {
                response = "Not Weird";
            }
        }
        System.out.println(response);
    }
}
