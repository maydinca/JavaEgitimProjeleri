package KullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi_00 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String userName, password, newPassword;

        System.out.print("Kullanıcı adını giriniz:");
        userName = scn.nextLine();
        System.out.print("Şifreyi giriniz:");
        password = scn.nextLine();
        if ((userName.equals("Deneme")) && (password.equals("Java123"))) {
            System.out.println("Giriş başarılı");
        } else {
            System.out.print("Hatalı kullanıcı adı veya şifre."
                    + "\nŞifrenizi sıfırlamak ister misiniz ? (evet veya hayır):");

            String response = scn.nextLine();
            if (response.equalsIgnoreCase("evet")) {
                System.out.print("Yeni şifreyi giriniz: ");
                newPassword = scn.nextLine();

                if (newPassword.equals("Java123")) {
                    System.out.print("Şifre bir onceki sifre ile ayni olamaz, lütfen farkli şifre giriniz...");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                    System.out.print("Yeni şifreniz:" + newPassword);
                }
            }
        }
    }
}



