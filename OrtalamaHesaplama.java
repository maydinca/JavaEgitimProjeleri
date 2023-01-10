import java.text.DecimalFormat;
import java.util.Scanner;

public class OrtalamaHesaplama {
    public static Scanner gradepoint=new Scanner(System.in);
    public static void main(String[] args) {
        isGrade(calcdersNotePuanToplam(inputPoint()));
    }

    public static void isGrade(double dersNotePuanToplam) {
        if (dersNotePuanToplam>80 && dersNotePuanToplam<=100){
            System.out.println("dersNotePuanToplam:"+new DecimalFormat("#.#").format(dersNotePuanToplam)+" Note: A Success");
        }else if (dersNotePuanToplam>70 && dersNotePuanToplam<=80){
            System.out.println("dersNotePuanToplam:"+new DecimalFormat("#.#").format(dersNotePuanToplam)+" Note: B Success");
        }
        else if (dersNotePuanToplam>50 && dersNotePuanToplam<=70){
            System.out.println("dersNotePuanToplam:"+new DecimalFormat("#.#").format(dersNotePuanToplam)+" Note: C Success");
        }else System.out.println("dersNotePuanToplam:"+new DecimalFormat("#.#").format(dersNotePuanToplam)+" Note: F Failed!");

    }
    public  static double calcdersNotePuanToplam(int [] score){
        int total=0;
        for (int i=0;i<score.length;i++){
            if(score[i]>=0&&score[i]<=100){
                total+=score[i];
            }
        }
        double dersNotePuanToplam=total/score.length;
        return dersNotePuanToplam;

    }
    public static  int [] inputPoint() {
        int mat = 0;
        int kim = 0;
        int tr = 0;
        int eng = 0;

        Scanner noteInput = new Scanner(System.in);
        System.out.println("***Grade Point dersNotePuanToplam Calculator***");
        System.out.println("Your Math Grade :");
        mat=noteInput.nextInt();
        System.out.println("Your Chemical Grade :");
        kim=noteInput.nextInt();
        System.out.println("Your Turkish Grade :");
        tr=noteInput.nextInt();
        System.out.println("Your Engilsh Grade :");
        eng=noteInput.nextInt();
        int [] gradeNote={mat,kim,tr,eng};
        return gradeNote;
    }
}
