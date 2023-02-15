package HavaSicakliginaGoreEtkinlikOnerisi;

import java.util.Scanner;

/**
 * Koşullar :
 *
 * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
 * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
 * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
 * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 * Ödev
 * Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
 */
public class HavaSicakliginaGoreEtkinlikOnerisi {
    public static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args){
        etkinlikOnerisi(havaSicakligiNedir());
    }
    public static void etkinlikOnerisi( int havaSicakligi){
        String str="";
        if (havaSicakligi<5){
            str="Kayak icin guzel bir gun olabilir";
        }else if((havaSicakligi>=5) && (havaSicakligi<=15)){
            str="Hava sinema icin guzel";

        }else if((havaSicakligi)>=15&&(havaSicakligi<=25)){
            str="Hava Piknik icin Guzel duruyor";

        }else if(havaSicakligi>25){
            str="Yuzme icin hava guzel duruyor";

        }
        System.out.println("Hava Sicakligina gore Onerim ="+str);
    }
    public static int havaSicakligiNedir(){
        System.out.println("Hava Sicakligini yazabilir misiniz?");
        int havaSicakligi=scanner.nextInt();
        return havaSicakligi;
    }

}

