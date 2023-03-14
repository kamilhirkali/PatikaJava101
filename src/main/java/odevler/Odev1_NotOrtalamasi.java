package odevler;

import java.util.Scanner;

public class Odev1_NotOrtalamasi {
    /*
    Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak,
eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int matematik,fizik,kimya,turkce,tarih,muzik;
        System.out.println("Matematik notunu giriniz..");
        matematik= input.nextInt();
        System.out.println("Fizik notunu giriniz..");
        fizik= input.nextInt();
        System.out.println("Kimya notunu giriniz..");
        kimya= input.nextInt();
        System.out.println("Turkce notunu giriniz..");
        turkce= input.nextInt();
        System.out.println("Tarih notunu giriniz..");
        tarih= input.nextInt();
        System.out.println("Muzik notunu giriniz..");
        muzik= input.nextInt();
        double ortalama=(matematik+fizik+kimya+turkce+tarih+muzik)/6.0;
        System.out.println("ortalama = " + ortalama);
        String sonuc=ortalama>60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("sonuc = " + sonuc);
    }


}
