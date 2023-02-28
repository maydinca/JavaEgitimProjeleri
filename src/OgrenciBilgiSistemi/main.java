package OgrenciBilgiSistemi;

public class main {
    public static void main(String[] args) {

        Teacher T1 = new Teacher("Ahmet Hoca", "05057780274", "BIO");
        Teacher T2 = new Teacher("Cihat Hoca", "05057780287", "FZK");
        Teacher T3 = new Teacher("Ayse Hoca", "05544405806", "KMY");
        Teacher T4 = new Teacher("Mahmut Hoca", "05551049261", "MAT");

        Course BIO = new Course("BIYOLOJI", "101", "BIO");
        BIO.addTeacher(T1);
        Course FZK = new Course("FIZIK", "101", "FZK");
        FZK.addTeacher(T2);
        Course KMY = new Course("KIMYA", "101", "KMY");
        KMY.addTeacher(T3);
        Course MAT = new Course("MATEMATIK", "101", "MAT");
        MAT.addTeacher(T4);

        Student S1 = new Student("Ufuk", "94", "10", BIO, MAT, FZK);
        Student S2 = new Student("Cihat", "99", "10", MAT, FZK, KMY);
        Student S3 = new Student("Abdulkadir", "124", "10", FZK, MAT, KMY);
        Student S4 = new Student("Mehmet", "86", "11", BIO, MAT, KMY);

        S3.addBulkExamNote(75,89,49);
        S3.isPass();
        System.out.println("==========================");
        S2.addBulkExamNote(58,39,97);
        S2.isPass();



    }
}
