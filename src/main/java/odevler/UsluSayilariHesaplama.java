package odevler;

import java.util.Scanner;

public class UsluSayilariHesaplama {
    /*Java döngüler ile
    girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi degeri giriniz : ");
        int n = input.nextInt();
        for (int k = 1; k <= n; k *= 4) {
            System.out.print(k + "-");
        }
        System.out.println();
        for (int m = 1; m <= n; m *= 5) {
            System.out.print(m + "-");
        }
    }
}
