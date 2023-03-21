package odevler;

import java.util.Scanner;

public class GirilenSayiOrtalamaHesaplama {
    /*Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,counter=0,sum = 0;
        double average;
        System.out.print("Sayi giriniz..");
        sayi=input.nextInt();
        for(int i=0;i<=sayi;++i){
            if(i%12==0){
                System.out.println("sayi = " + i);
                counter++;
                sum+=i;
            }
        }
        System.out.println("average = " + sum / counter);

    }


}
