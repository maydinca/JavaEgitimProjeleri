package PalindromNumber;

public class isPalindrom {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            System.out.println("last number : " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("reverse number : " + reverseNumber);
            temp = temp / 10;
            System.out.println("temp Number : "+temp);
            System.out.println("****************");

        }
        if (number == reverseNumber)
            return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(929));
    }
}
