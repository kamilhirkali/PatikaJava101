package odevler;

import java.util.Scanner;

public class SinifGectiKaldi {
    /*
    Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/
    public static void main(String[] args) {
        int mat,fiz,tur,kim,sos,counter=5;
        double average;

        Scanner input=new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat= input.nextInt();
        if(mat<0 || mat>100){
            mat=0;
            counter--;
        }

        System.out.print("Fizik notunuzu giriniz : ");
        fiz= input.nextInt();
        if(fiz<0 || fiz>100){
            fiz=0;
            counter--;
        }

        System.out.print("Turkce notunuzu giriniz : ");
        tur= input.nextInt();
        if(tur<0 || tur>100){
            tur=0;
            counter--;
        }

        System.out.print("Kimya notunuzu giriniz : ");
        kim= input.nextInt();
        if(kim<0 || kim>100){
            kim=0;
            counter--;
        }

        System.out.print("Sosyal Bilgiler notunuzu giriniz : ");
        sos= input.nextInt();
        if(sos<0 || sos>100){
            sos=0;
            counter--;
        }

        if (counter!=0){
            average=(mat+fiz+kim+tur+sos)/counter;
            System.out.println("Ortalamaniz  = " + average);
        }else{
            System.out.println("Ortalama hesaplanamaz! Girilen ders notlarinin hepsi gecersiz aralikta");
        }


    }






}
