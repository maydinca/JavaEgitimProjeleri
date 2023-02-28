package OgrenciBilgiSistemi;

public class Teacher {
    //nitelikler
    String name;
    String mobileNumber;
    String branch;

    //kurucu metot
    Teacher(String name, String mobileNumber, String branch) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.branch = branch;
    }

    //davanıslar
    void info() {
        System.out.println("Ad - Soyad \t: " + this.name);
        System.out.println("Tel No     \t: " + this.mobileNumber);
        System.out.println("Bransi     \t: " + this.branch);
    }
}
