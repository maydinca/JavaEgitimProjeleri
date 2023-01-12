public class Test999 {
    public static void main(String[] args) {
        /**
         * "3 4 5" çıktısı, iç döngüden gelir. Burada j 1'den başlar ve her seferinde 1 artar. İç döngünün her iterasyonunda, j'nin değeri, şu anda 2 olan i'nin değerine eklenir ve bu sonuç yazdırılır.
         *
         * Burada detaylı açıklaması ;
         *
         * i=2 olduğunda;
         *
         * j=1 olduğunda : i+j = 2+1 = 3 yazdırılır
         * j=2 olduğunda : i+j = 2+2 = 4 yazdırılır
         * j=3 olduğunda : i+j = 2+3 = 5 yazdırılır
         * Bu yüzden yazdırma ifadesi 345 çıktısını verecektir.
         */
//        for (int i = 1; i <= 2; ++i) {
//            for (int j = 1; j < 4; ++j) {
//                if (i == 1) continue;
//                System.out.print(i + j);
//            }
//        }

        for (int k = 0; k < 9; k++) {
            System.out.print("*");
            if (k == 3)
                break;
        }
    }
}
