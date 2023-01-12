public class DoWhile {
    public static void main(String[] args) {
//        int age=20;
//        do
//        {
//            age++;
//        }while(age<20);
//
//        System.out.println(age);
//


        int i=1, j=1;
        while(i<4)
        {
            do
            {
                System.out.print(j + ",");
                j++;
            }while(j<4);
            i++;
        }
    }
}
// i, 1 olduğunda; j 1 oldu, 2 oldu 3 oldu ve koşuldan çıktı.
// i 'yi 1 arttırdık ve i 2 olduğunda j 4 oldu çünkü i de j de 1 arttırılıyor yani başa dönüp 1,2,3 olmuyor.
// Şıktaki tek eksik; virgül olması lazımdı sonunda. idenizde deneyiniz.

//j=1 en üste tanımlanmış,döngünün içinde j=1; denilmemiş yaani şöyle i bir kere dönüyor i dönerken
// j değeri j++ diyerek 4'de kadar gidiyor&gt;&gt; bu i=1 olduğunda ilk işlem i = 2 olduğunda giriyor
// içeri hala j = 4 durumunda j=1 ile j'nin değeri döngü içinde içinde değiştirlmesi lazım döngü dışında
// kalınca malesef kaldığı yerden devam ediyor.