package odevler;

import java.util.Scanner;

public class BurcBulma {
    /*
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart*/

    public static void main(String[] args) {
        String burc = "";
        int dGun,dAy;
        boolean isError=false;
        Scanner input=new Scanner(System.in);

        System.out.print("Dogdugunuz gunu giriniz : ");
        dGun=input.nextInt();
        System.out.print("Dogdugunuz ayi giriniz : ");
        dAy=input.nextInt();

        if(dAy==1){
            if(dGun>0 && dGun<32) {
                if (dGun < 22) {
                    burc = "Oglak";
                } else {
                    burc = "Kova";
                }
            }else{
                    isError=true;
                }
        }else if(dAy==2){
            if(dGun>0 && dGun<30) {
                if (dGun < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balik";
                }
            }else{
                isError=true;
            }
        }else if(dAy==3){
            if(dGun>0 && dGun<32) {
                if (dGun < 21) {
                    burc = "Balik";
                } else {
                    burc = "Koc";
                }
            }else{
                isError=true;
            }
        }else if(dAy==4){
            if(dGun>0 && dGun<31) {
                if (dGun < 21) {
                    burc = "Koc";
                } else {
                    burc = "Boga";
                }
            }else{
                isError=true;
            }
        }else if(dAy==5){
            if(dGun>0 && dGun<32) {
                if (dGun < 22) {
                    burc = "Boga";
                } else {
                    burc = "Ikizler";
                }
            }else{
                isError=true;
            }
        }else if(dAy==6){
            if(dGun>0 && dGun<31) {
                if (dGun < 23) {
                    burc = "Ikizler";
                } else {
                    burc = "Yengec";
                }
            }else{
                isError=true;
            }
        }else if(dAy==7){
            if(dGun>0 && dGun<32) {
                if (dGun < 23) {
                    burc = "Yengec";
                } else {
                    burc = "Aslan";
                }
            }else{
                isError=true;
            }
        }else if(dAy==8){
            if(dGun>0 && dGun<32) {
                if (dGun < 23) {
                    burc = "Aslan";
                } else {
                    burc = "Basak";
                }
            }else{
                isError=true;
            }
        }else if(dAy==9){
            if(dGun>0 && dGun<31) {
                if (dGun < 23) {
                    burc = "Basak";
                } else {
                    burc = "Terazi";
                }
            }else{
                isError=true;
            }
        }else if(dAy==10){
            if(dGun>0 && dGun<32) {
                if (dGun < 23) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            }else{
                isError=true;
            }
        }else if(dAy==11){
            if(dGun>0 && dGun<31) {
                if (dGun < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            }else{
                isError=true;
            }
        }else if(dAy==12) {
            if (dGun > 0 && dGun < 32) {
                if (dGun < 22) {
                    burc = "Yay";
                } else {
                    burc = "Oglak";
                }
            } else {
                isError = true;
            }
        }else{
            isError=true;
            }


          if (isError){
              System.out.print("Gecersiz deger girildi");
          }else{
              System.out.println("Burcunuz : "+ burc);
          }

        }

    }

