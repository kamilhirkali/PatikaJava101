package odevler;

import java.util.Scanner;

public class Odev2_KdvTutarHesaplama {
    public static void main(String[] args) {
        /*KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
KDV tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak
KDV tutarı hesaplayan programı yazınız.*/
        double fiyat,kdv,kdvliFiyat,kdvOran;
        Scanner input =new Scanner(System.in);
        System.out.println("Fiyat degerini giriniz");
        fiyat= input.nextDouble();
        kdv=(fiyat>=0 && fiyat<=1000) ? 0.18 :0.08;
        kdvOran=fiyat*kdv;
        kdvliFiyat=fiyat+kdvOran;
        System.out.println("Kdv siz fiyat = " + fiyat);
        System.out.println("Kdv Orani = " +kdvOran);
        System.out.println("Kdv li Fiyat = " + kdvliFiyat);
    }



}
