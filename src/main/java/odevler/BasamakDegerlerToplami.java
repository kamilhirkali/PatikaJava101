package odevler;

import java.util.Scanner;

public class BasamakDegerlerToplami {
 /*   Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

    Örnek : 1643 = 1 + 6 + 4 + 3 = 14*/

    public static void main(String[] args) {

        int number,basamakValue=0,sum=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayi degerini giriniz");
        number = input.nextInt();

        while(number!=0){
            basamakValue=number%10;
            sum+=basamakValue;
            number/=10;
          }

        System.out.println("Basamak degerleri toplami :"+sum);


    }
}
