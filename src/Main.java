import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int  yas , mesafe ,yolculuk_tipi;
        double yas_indirimi_orani ;
        double bilet_indirimi =0;
        double toplam = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Gideceğiniz mesafeyi(km) giriniz :");
        mesafe = scanner.nextInt();

        System.out.println("Yaşınızı giriniz : ");
        yas = scanner.nextInt();

        System.out.println("Yolculuk tipini seçiniz : \n1 .Tek Yön\n2.Gidiş Dönüş");
        yolculuk_tipi = scanner.nextInt();

        if(yas < 12){
            yas_indirimi_orani = 0.5;

        } else if (12 <= yas && yas <= 24) {
            yas_indirimi_orani = 0.10;

        } else if (yas < 65 ) {
            yas_indirimi_orani = 0.30;

        }else {
            yas_indirimi_orani = 0.0;
        }

        double tutar = mesafe * 0.10 ;
        double yas_indirimi = tutar * yas_indirimi_orani;
        double indirim_tutar = tutar- yas_indirimi;


        if (!(mesafe>0)){
            System.out.println("Hatalı veri girdiniz");
        }
        else {
            switch (yolculuk_tipi){
                case 1 :
                    toplam = indirim_tutar ;

                    break;
                case 2 :
                    bilet_indirimi = indirim_tutar * 0.20;
                    toplam = (indirim_tutar - bilet_indirimi ) * 2;
                    break;
                default:
                    System.out.println("Hatalı veri girdiniz ");
            }
        System.out.println("Ödemeniz gereken toplam tutar : " + toplam);}
    }
}