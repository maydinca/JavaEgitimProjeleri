package Fibonacci;

import java.util.Scanner;

public class FibonacciRecursive {
    static int fibonacci(int n){
        if (n==0) { // if index equal 0, return 0.
            return 0 ;
        }

        else if (n == 1 || n == 2 ) { //if index equal 1 or 2 ; return 1 .
            return 1 ;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index : ");
        int n = input.nextInt();
        fibonacci(n);
        System.out.println(fibonacci(n));
    }
}
