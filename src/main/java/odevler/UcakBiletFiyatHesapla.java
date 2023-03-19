package odevler;

import java.util.Scanner;

public class UcakBiletFiyatHesapla {
    /*
    Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
    Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
    Mesafe başına ücret 0,10 TL / km olarak alın.
    İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
 Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/
    public static void main(String[] args) {
        boolean isError = false;
        int mesafe, yas, yolculukTip;
        double kmUcret = 0.10, normalTutar = 0,yasIndirim=0, gidisDonusIndirim=0, indirimliTutar=0, toplamTutar=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz :");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculukTip = input.nextInt();

        if (mesafe > 0 && yas > 0 && ((yolculukTip == 1) || (yolculukTip == 2))) {
            normalTutar = mesafe * kmUcret;
            if (yas < 12) {
                yasIndirim = normalTutar * 0.5;
                indirimliTutar = normalTutar - yasIndirim;
                if (yolculukTip == 2) {
                    gidisDonusIndirim = indirimliTutar * 0.2;
                    toplamTutar = (indirimliTutar - gidisDonusIndirim) * 2;
                } else {
                    toplamTutar = indirimliTutar;
                }
            } else if (yas < 25) {
                yasIndirim = normalTutar * 0.1;
                indirimliTutar = normalTutar - yasIndirim;
                if (yolculukTip == 2) {
                    gidisDonusIndirim = indirimliTutar * 0.2;
                    toplamTutar = (indirimliTutar - gidisDonusIndirim) * 2;
                } else {
                    toplamTutar = indirimliTutar;
                }
            } else if (yas < 66) {
                if (yolculukTip == 2) {
                    gidisDonusIndirim = normalTutar * 0.2;
                    toplamTutar = (normalTutar - gidisDonusIndirim) * 2;
                } else {
                    toplamTutar = normalTutar;
                }
            } else {
                yasIndirim = normalTutar * 0.3;
                indirimliTutar = normalTutar - yasIndirim;
                if (yolculukTip == 2) {
                    gidisDonusIndirim = indirimliTutar * 0.2;
                    toplamTutar = (indirimliTutar - gidisDonusIndirim) * 2;
                } else {
                    toplamTutar = indirimliTutar;
                }
            }
        } else {
            isError = true;
        }

        if(isError){
            System.out.println("Hatalı Veri Girdiniz !");
        }else {
            System.out.println("Normal Tutar : " + normalTutar + " TL");
            System.out.println("Yas Indirimi : " + yasIndirim + " TL");
            System.out.println("Indirimli Tutar : " + indirimliTutar + " TL");
            System.out.println("Gidis Donus Bilet Indirimi :" + gidisDonusIndirim + " TL");
            System.out.println("Toplam Tutar : " + toplamTutar + " TL");
        }

    }

}









