package odevler;

import java.util.Scanner;

public class Odev5_DaireAlanCevreHesaplama {
    /*Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360 */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double pi=3.14,alan,cevre,bolumAlan;
        System.out.println("Yaricap degerini giriniz : ");
        int r= input.nextInt();
        alan=pi*r*r;
        cevre=2*pi*r;
        System.out.println("Dairede alani hesaplanacak merkez aci degerini giriniz : ");
        int y= input.nextInt();
        bolumAlan=(pi*(r*r)*y)/360;
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
        System.out.println("Dairenin istenilen bolumun alani = " + bolumAlan);


    }



}
