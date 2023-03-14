package odevler;

import java.util.Scanner;

public class Odev3_UcgenAlanHesaplama {
    public static void main(String[] args) {
        /*Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/
   Scanner input=new Scanner(System.in);
        int a, b;
        double c, u, alan;
        System.out.print("Ucgenin 1.kenar uzunlugu degerini giriniz  :  ");
        a = input.nextInt();
        System.out.print("Ucgenin 2.kenar uzunlugu degerini giriniz  :  ");
        b = input.nextInt();
        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenus =" + c);
        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Ucgenin Alani : " + alan);

    }
}
