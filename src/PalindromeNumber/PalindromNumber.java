package PalindromeNumber;

import java.util.Scanner;

public class PalindromNumber {
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        isPalindrome(input());
    }
    static int input(){

        System.out.println("Please enter a Palindrome Number :");
        int userNumber=scan.nextInt();
        return userNumber;
    }
    static void isPalindrome(int number){
        String Palindrome=Integer.toString(number);
        StringBuffer sb = new StringBuffer(Palindrome);
        String PalindromeRevers= String.valueOf(sb.reverse());
        System.out.println("Revers Number is ==> " +PalindromeRevers);
        System.out.println("******************************");
        boolean isPalindrome=false;
        if (Palindrome.equals(PalindromeRevers)){
            isPalindrome=true;
        } else{
            isPalindrome=false;
        }
        if (isPalindrome){
            System.out.print(number+" is Palindrome Number");
        } else{
            System.out.print(number+" is not Palindrome Number");
        }
    }
}

