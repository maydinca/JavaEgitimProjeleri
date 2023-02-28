package OgrenciBilgiSistemi;

public class Course {
    //nitelikler
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    //Coctructer tanımlancak
    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;

        } else {
            System.out.println("DERS ILE OGRETMEN BRANSLARI UYUSMADI .");
        }
    }

    void infoTeacher() {
        this.teacher.info();
    }
}

