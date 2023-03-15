package odevler;

import java.util.Scanner;

public class Odev4_Taksimetre {
    /*Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.*/
    public static void main(String[] args) {
        double perKm=2.2,toplamUcret=10,gidilenYol;

        Scanner input=new Scanner(System.in);
        System.out.println("Gidilen yol kac km ? : ");
        gidilenYol=input.nextDouble();
        toplamUcret+=(perKm*gidilenYol);
        toplamUcret=toplamUcret<=20 ? 20 : toplamUcret;
        System.out.println("Toplam Odenecek Ucret = " + toplamUcret);

    }

}
