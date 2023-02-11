package PalindromNumber;
/*
Create a method which will return boolean
               If provided Integer is palindrome, return true. Else, return false.
        Example:
               Input: 123321
               Output: true
 */
public class palindromeInteger_2 {
    public static void main(String[] args) {
        int num = 12355321;
        System.out.println(num);
//        System.out.println(palindromMu2(num));
        System.out.println(isPalindrome(num));

    }

    public static boolean palindromMu(int num) {
        int numLenght = String.valueOf(num).length();
        String reverse="";
        for (int i = numLenght-1; i >=0; i--) {
            char ch=String.valueOf(num).charAt(i);
            reverse=reverse.concat(String.valueOf(ch));
        }
        System.out.println(reverse);
        if(String.valueOf(num).equals(reverse)){
            return true;
        }
        return false;
    }

    public static boolean palindromMu2(int num){
        int numLength = String.valueOf(num).length();
        for (int i = 0, j=numLength-1; i <numLength/2; i++,j--) {
            if(String.valueOf(num).charAt(i)==String.valueOf(num).charAt(j)){
//                System.out.println("palindrom");
                return true;
            }
        }
//        System.out.println("Palindrom degil");
        return false;
    }

    public static boolean isPalindrome(int x) {
        int sum=0;
        int rem;
        int temp=x;
        while (temp>0){
            rem=temp%10;
            sum=sum*10+rem;
            temp/=10;
        }
        if(x==sum){
            return true;
        }else return false;
    }
}