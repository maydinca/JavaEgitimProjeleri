package PalindromNumber;

import java.util.Scanner;

public class Polindromikkelime {
    public static void main(String[] args) {
        Scanner Scan= new Scanner(System.in);
        System.out.println("Lutfen bir kelime yaz : ");
        String str = Scan.next(), reverseStr = "";
        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}

