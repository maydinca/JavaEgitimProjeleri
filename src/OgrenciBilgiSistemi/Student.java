package OgrenciBilgiSistemi;
public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.average = 0;
        this.isPass = false;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;

    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (c1.note >= 0 && c1.note <= 100) {
            this.c1.note = note1;
        }
        if (c2.note >= 0 && c2.note <= 100) {
            this.c2.note = note2;
        }
        if (c3.note >= 0 && c3.note <= 100) {
            this.c3.note = note3;
        }
        System.out.println("OGRENCI ADI : " + this.name);
        System.out.println("OGRENCI NO  : " + this.stuNo);
    }


    void printNote() {
        System.out.println(c1.name + "  NOTU  : " + c1.note);
        System.out.println(c2.name + "  NOTU  : " + c2.note);
        System.out.println(c3.name + "  NOTU  : " + c3.note);
        System.out.println("ORTALAMANIZ : " + this.average);
    }

    void isPass() {
        this.average = ((c1.note + c2.note + c3.note) / 3);
        if (this.average >= 65) {
            System.out.println("SINIFI GECTINIZ , TEBRIKLER :)");
        } else {
            System.out.println("SINIFTA KALDINIZ , SENEYE TERKAR GORUSURUZ :(");
        }

        printNote();

    }

}