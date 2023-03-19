package odevler;

import java.util.Scanner;

public class ArtikYilHesaplama {
    /*Artık Yıl Nasıl Hesaplanır?

Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.*/
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();
        boolean leap = (yil % 100 == 0 ? (yil % 400 == 0) : yil % 4 == 0);
        if(leap){
            System.out.println(yil + " bir artık yıldır !");
        }else {
            System.out.println(yil + " bir artık yıl değildir !");
        }

     /*
     //2.yol uzun hali
     if (yil % 400 == 0) {
            System.out.println(yil + " bir artık yıldır !");
        } else if (yil % 100 > 0 && yil % 4 == 0) {
            System.out.println(yil + " bir artık yıldır !");
        } else {
            System.out.println(yil + " bir artık yıl değildir !");
        }*/
    }
}
