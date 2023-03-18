package odevler;

import java.util.Scanner;

public class KullaniciGirisi {
    /*
    Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
    eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
    ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
    şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
    sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
    */
    public static void main(String[] args) {
        String user = "patika", password = "1234", kullaniciAdi, sifre, sifirla, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici adini giriniz : ");
        kullaniciAdi = input.nextLine();

        System.out.print("Sifrenizi giriniz :");
        sifre = input.nextLine();

        if (kullaniciAdi.equals(user) && sifre.equals(password)) {
            System.out.println("Sisteme giris yaptiniz...");
        } else if (!kullaniciAdi.equals(user) && !sifre.equals(password)) {
            System.out.println("Kullanici adiniz ve sifreniz yanlis Giris gecersiz");
        } else if (kullaniciAdi.equals(user) && !sifre.equals(password)) {
            System.out.println("Kullanici adiniz dogru Sifreniz yanlis..\nSifrenizi sifirlamak istermisiniz : E/H ");
            sifirla = input.nextLine().toUpperCase();
            if (sifirla.equals("E")) {
                System.out.println("Yeni sifrenizi giriniz.. ( Yeni sifreniz daha once kullandiginiz sifre ile ayni olmamalidir !)");
                newPassword = input.nextLine();
                if (!newPassword.equals(password) && !newPassword.equals(sifre)) {
                    System.out.println("Şifre oluşturuldu");
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            } else {
                System.out.println("Giris islemi basarisiz");
            }
        } else {
            System.out.println("Giris islemi basarisiz");
        }
    }
}



