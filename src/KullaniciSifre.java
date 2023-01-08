import java.util.Scanner;

public class KullaniciSifre {
    /*Ödev
       Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
       eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu
       şifre ile aynı olmaması gerektiğini kontrol edip ,şifreler aynı ise ekrana "Şifre
       oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
       */
    public static void main(String[] args) {
        String userName ="Deneme", password ="Java123";
        String userResponse = "";
        String password1 ="";
        String passwordConfirm ="";

                Scanner scan = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızi Giriniz!");
        userName = scan.nextLine();
        System.out.print("Şifrenizi Giriniz!");
        password = scan.nextLine();

        if ((userName.equals("Deneme")) && (password.equals("Java123"))) {
            System.out.println("Oturumunuz basari ile aciliyor...........");
        } else if ((!userName.equals("Deneme")) || (!password.equals("Java123"))) {
            System.out.println("Kullanici adi veya Kullanici sifresi hatali....Sifreyi degistirmek ister misiniz");
            userResponse = scan.nextLine();
        }

        if (userResponse.equalsIgnoreCase("Evet")) {
            System.out.println("Yeni şifrenizi giriniz.");
            password1 = scan.nextLine();
            System.out.println("Yeni şifrenizi dogrulayiniz!");
            passwordConfirm = scan.nextLine();
            String passCheck=password1.equals(passwordConfirm)?"Sifre eslesti": "Sifre Eslesmedi";
            System.out.println(passCheck);

        } else if (password1.equals(password)) {
                System.out.println("Sifre bir onceki ile ayni olamaz");
        } else {
                System.out.println("Şifreniz Başarıyla Guncellendi...");
                System.out.println("Oturumunuz Aciliyor....");
        }


        }

        }





