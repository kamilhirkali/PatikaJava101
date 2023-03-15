package odevler;

import java.util.Scanner;

public class HesapMakinasi {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz : ");
        int sayi1=input.nextInt();
        System.out.println("ikinci sayiyi giriniz : ");
        int sayi2=input.nextInt();
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\nSecim icin bir deger giriniz.... ");
    int secim= input.nextInt();

    switch(secim){

        case 1:
            System.out.println("Toplam ="+(sayi1+sayi2));
            break;
        case 2:
            System.out.println("Cikarma ="+(sayi1-sayi2));
            break;
        case 3:
            System.out.println("Carpma ="+(sayi1*sayi2));
            break;
        case 4:
            System.out.println((sayi2 != 0) ? "Bolum = "+(sayi1/sayi2) : "Sayi 0 'a bolunemez");
            break;
        default:
            System.out.println("Girilen secim degeri gecersizdir.Lutfen gecerli secim degeri giriniz...");

    }




    }





}
