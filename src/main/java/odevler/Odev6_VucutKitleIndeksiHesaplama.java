package odevler;

import java.util.Scanner;

public class Odev6_VucutKitleIndeksiHesaplama {
/*Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)
*/

    public static void main(String[] args) {
        double kg,boy,vki;
        Scanner input =new Scanner(System.in);
        System.out.print("Lutfen kilonuzu kg olarak giriniz : ");
        kg= input.nextDouble();
        System.out.print("Lutfen Boyunuzu metre olarak giriniz : ");
        boy= input.nextDouble();
        vki=kg/(boy*boy);
        System.out.println("Vucut Kitle indeksiniz = " + vki);


    }

}
