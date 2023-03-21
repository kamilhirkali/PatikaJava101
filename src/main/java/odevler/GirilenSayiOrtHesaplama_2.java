package odevler;

import java.util.Scanner;

public class GirilenSayiOrtHesaplama_2 {
    /*
    Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
    girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
    */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int sayi=0,sum=0;
        do{
            System.out.print("Sayi giriniz : ");
            sayi=input.nextInt();
            if(sayi%4==0){
                sum+=sayi;
            }
        }while(sayi%2==0);

        System.out.println("Toplam :"+sum);
    }
}
