package odevler;

import java.util.Scanner;

public class KombinasyonHesaplama {
    /*N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li
    kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)*/


    public static void main(String[] args) {
        int fakN , fakR , fakFark , n, r,result;


        Scanner input = new Scanner(System.in);

        System.out.print("Eleman Sayisini giriniz : ");
        n = input.nextInt();

        System.out.print("Grup Sayisini giriniz : ");
        r = input.nextInt();

        if ((n > r) && (n * r > 0)) {
            result = (int) (fakHesap(n) / (fakHesap(r)*fakHesap(n-r)));
            System.out.println("Kombinasyon sonucu = " + result);
        } else {
            System.out.println("HATA ! Gecersiz aralikta deger girildi ");
        }
    }

    public static double fakHesap(int sayi) {
        if (sayi == 1) {
            return 1;
        }
        return (sayi * fakHesap(sayi - 1));
    }


}
