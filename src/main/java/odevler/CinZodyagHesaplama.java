package odevler;

import java.util.Scanner;

public class CinZodyagHesaplama {
    /*Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
Doğum Tarihi %12 = 0 ➜ Maymun
Doğum Tarihi %12 = 1 ➜ Horoz
Doğum Tarihi %12 = 2 ➜ Köpek
Doğum Tarihi %12 = 3 ➜ Domuz
Doğum Tarihi %12 = 4 ➜ Fare
Doğum Tarihi %12 = 5 ➜ Öküz
Doğum Tarihi %12 = 6 ➜ Kaplan
Doğum Tarihi %12 = 7 ➜ Tavşan
Doğum Tarihi %12 = 8 ➜ Ejderha
Doğum Tarihi %12 = 9 ➜ Yılan
Doğum Tarihi %12 = 10 ➜ At
Doğum Tarihi %12 = 11 ➜ Koyun*/
    public static void main(String[] args) {
        int dTarihi,sonuc;
        String burc="";
        boolean isError=false;
        Scanner input=new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz :  ");
        dTarihi=input.nextInt();
       if(dTarihi>1900 && dTarihi<=2023) {
           sonuc = dTarihi % 12;

           switch (sonuc) {

               case 0:
                   burc = "Maymun";
                   break;
               case 1:
                   burc = "Horoz";
                   break;
               case 2:
                   burc = "Köpek";
                   break;
               case 3:
                   burc = "Domuz";
                   break;
               case 4:
                   burc = "Fare";
                   break;
               case 5:
                   burc = "Öküz";
                   break;
               case 6:
                   burc = "Kaplan";
                   break;
               case 7:
                   burc = "Tavşan";
                   break;
               case 8:
                   burc = "Ejderha";
                   break;
               case 9:
                   burc = "Yılan";
                   break;
               case 10:
                   burc = "At";
                   break;
               case 11:
                   burc = "Koyun";
                   break;
               default:
                   isError = true;
           }
       }else{
               isError=true;
           }
        if(isError){
            System.out.println("girilen deger gecersizdir");
        }else {
            System.out.println("Çin Zodyağı Burcunuz :" + burc);
        }
    }
}
