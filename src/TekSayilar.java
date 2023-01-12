public class TekSayilar {
    public static void main(String[] args) {
        int i = 1;
//        for (int i = 1; i <=10 ; i++) {
//            if(i%2==0)
//            System.out.print("Cift sayilar : "+i+" ,");
//            else {
//                System.out.println("Teksayilar :"+i);
//            }
//
//        }
        System.out.println("***********************");

        while (i <= 10) {
            i++;
            if (i % 2 == 0) {
                continue;


            }
            System.out.println("tek sayilar :" + i);



        }
    }
}