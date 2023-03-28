package odevler;

import java.util.Scanner;

public class UsluSayiHesaplama2 {
    public static void main(String[] args) {
        int n,k,result=1;
        Scanner input =new Scanner(System.in);

        System.out.println("Ussu alinacak sayiyi giriniz");
        n= input.nextInt();

        System.out.println("Us degerini giriniz");
        k= input.nextInt();

        for(int i=1;i<=k;i++) {
            result *= n;
        }
        System.out.println("Sonuc = " +result);
    }

}
