package ForDongusu;

public class ForDongusu_3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0, j = 0; i < 5 || j < 5; ++i, j = i + 1) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("****");

        for (int i = 7; i <=77 ; i+=7) {
            System.out.println(i);

        }
    }
}
