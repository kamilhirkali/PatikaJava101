package odevler;

import java.util.Scanner;

public class HackerRank_01 {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
int count=0;
        for(int i=0;i<t;i++)
        {
                double x=sc.nextDouble();
                count=0;
                System.out.println(x+" can be fitted in: ");
                if(x>=-128 && x<=127) {
                    System.out.println("* byte");
                    count++;
                }
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){
                    System.out.println("* short");
                    count++;
                }
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){
                    System.out.println("* int");
                    count++;
                }
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){
                    System.out.println("* long");
                    count++;
                }
                   if (count==0){System.out.println(" can't be fitted anywhere.");}
       }
    }
}