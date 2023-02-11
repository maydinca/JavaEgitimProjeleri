public class Boolean {
    public static void main(String[] args) {

        boolean a = true, b = false;
        System.out.println((a && b) || (a || b));

//        int var1 = 5;
//        int var2 = 6;
//        if ((var2 = 1) == var1)
//            System.out.print(var2);
//        else
//            System.out.print(++var2);


    }

    public static class test02_ {
    //    class Recursion {
            static int basamaklarToplami(int sayi) {
                if (sayi == 0) {
                    return 0;
                } else
                    return sayi % 10 + basamaklarToplami(sayi / 10);
            }

            public static void main(String[] args) {
                System.out.println("Basamak toplami: " + basamaklarToplami(45612));
            }
        }
}





