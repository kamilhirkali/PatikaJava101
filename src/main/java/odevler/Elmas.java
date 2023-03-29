package odevler;

import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        int i,k,m=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Istenilen Satir sayisi degerini giriniz : ");
        int n= input.nextInt();

        for (i = 1; i <=n; i++) {
            for (k = 1; k <=(n-i); k++) {
                System.out.print(" ");
            }
            for (m = 1; m <= (2*i)-1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int t = n-1; t>0; t--) {
            for(int s=t;s<n;s++){
                System.out.print(" ");
            }
        for(int j=1;j<=(2*t)-1;j++){
            System.out.print("*");
        }
            System.out.println();
        }
    }
}
