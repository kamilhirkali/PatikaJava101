package odevler;

import java.util.Scanner;

public class HarmonikSayi {
    /*Java ile girilen sayının harmonik serisini bulan program yazacağız.*/
    public static void main(String[] args) {
        double hrmSayi=0;
        int n;
        Scanner input=new Scanner(System.in);

        System.out.print("Harmonik sayi sinir degerini giriniz ");
        n= input.nextInt();

        for(int i=1;i<=n;i++){
            hrmSayi+=(1.0/i);
        }

        System.out.println("harmonik sayi toplami = " + hrmSayi);

    }

}
