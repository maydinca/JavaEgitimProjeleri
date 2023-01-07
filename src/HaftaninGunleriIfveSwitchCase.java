import java.util.Scanner;

public class HaftaninGunleriIfveSwitchCase {
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        System.out.println("Hangi gunde oldugumuzu ogrenmek icin bir rakam giriniz!");
        int day =scn.nextInt();

        if (day == 1) {
            System.out.println("Bugun Gunlerden Pazartesi");
        } else if (day == 2) {
            System.out.println("Bugun Gunlerden Sali");
        } else if (day == 3) {
            System.out.println("Bugun Gunlerden Carsamba");
        } else if (day == 4) {
            System.out.println("Bugun Gunlerden Persembe");
        } else if (day == 5) {
            System.out.println("Bugun Gunlerden Cuma");
        } else if (day == 6) {
            System.out.println("Bugun Gunlerden Cumartesi");
        } else if (day == 7) {
            System.out.println("Bugun Gunlerden Pazar");
        } else {
            System.out.println("Girilen veri uygun degildir.");
        }
        System.out.println("************************************************");
        switch (day){
            case 1:
                System.out.println("Bugun Gunlerden Pazartesi");
                break;
            case 2:
                System.out.println("Bugun Gunlerden Sali");
                break;
            case 3:
                System.out.println("Bugun Gunlerden Carsamba");
                break;
            case 4:
                System.out.println("Bugun Gunlerden Persembe");
                break;
            case 5:
                System.out.println("Bugun Gunlerden Cuma");
                break;
            case 6:
                System.out.println("Bugun Gunlerden Cumartesi");
                break;
            case 7:
                System.out.println("Bugun Gunlerden Pazar");
                break;
            default:
                System.out.println("Girilen veri uygun degildir.");
        }
    }
}
