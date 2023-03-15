package odevler;

import java.util.Scanner;

public class Odev7_ManavKasaProgrami {
    /*Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
*/
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5,toplamTutar;
        Scanner input=new Scanner(System.in);
        System.out.print("Armut kac kg ? : ");
        armut*= input.nextDouble();
        System.out.print("Elma kac kg ? : ");
        elma*= input.nextDouble();
        System.out.print("Domates kac kg ? : ");
        domates*= input.nextDouble();
        System.out.print("Muz kac kg ? : ");
        muz*= input.nextDouble();
        System.out.print("Patlican kac kg ? : ");
        patlican*= input.nextDouble();
        toplamTutar=armut+elma+domates+muz+patlican;
        System.out.println("Toplam Odenecek Tutar = " + toplamTutar+ " TL ");


    }


}
