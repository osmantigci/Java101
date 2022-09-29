import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args){
        String userName, password, kullaniciAdi, parola, evetVeyaHayir, yeniParola;

        Scanner inp = new Scanner(System.in);

        kullaniciAdi = "patika";
        parola = "java101";

        System.out.print("Kullanıcı Adı: ");
        userName = inp.nextLine();

        System.out.print("Parola: ");
        password = inp.nextLine();

        if (kullaniciAdi.equals(userName) && parola.equals(password)) {
            System.out.print("Hoşgeldiniz Sayın " + kullaniciAdi);

        } else if (!kullaniciAdi.equals(userName) && parola.equals(password)) {
            System.out.print("Böyle bir kullanıcı bulunamadı! ");

        } else if (!kullaniciAdi.equals(userName) && !parola.equals(password)) {
            System.out.print("Kullanıcı adı veya parolanız hatalı! ");

        } else if (kullaniciAdi.equals(userName) && !parola.equals(password)) {
            System.out.print("Parolanızı yanlış girdiniz! ");
            System.out.print("Parolanızı değiştirmek ister misiniz ? evet/hayır: ");
            evetVeyaHayir = inp.nextLine();

            if (evetVeyaHayir.equals("evet")) {
                System.out.print("Yeni parolanızı giriniz: ");
                yeniParola = inp.nextLine();

                if (yeniParola.equals("java101")) {
                    System.out.print("Yeni parolanız eski parolanız ile aynı olamaz !");
                } else {
                    parola = yeniParola;
                    System.out.print(" Parolanız başarılı şekilde değiştirildi. ");
                }
            } else {
                System.out.print("Giriş ekranına yönlendiriliyorsunuz. ");
            }
        }

    }
}
