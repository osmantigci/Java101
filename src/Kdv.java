import java.util.Scanner;

public class Kdv {
    public static void main (String[] args) {
        double kdvsizFiyat, kdvliFiyat, kdvTutari, kdvYuzdesi;
        Scanner input = new Scanner(System.in);
        System.out.println("Ürünün Fiyatını Giriniz : ");
        kdvsizFiyat = input.nextDouble();

        // Ürünün fiyatı 1000 Tl' den düşükse kdv %18, değilse kdv %8
        kdvYuzdesi = (kdvsizFiyat <= 1000? 0.18 : 0.08);
        // Ürünün kdv tutarını hesaplayalım
        kdvTutari = kdvsizFiyat * (kdvYuzdesi);
        // Ürünün kdvli fiyatını hesaplayalım
        kdvliFiyat = kdvsizFiyat + kdvTutari;


        System.out.println("KDV'siz Fiyat :" + kdvsizFiyat);
        System.out.println("KDV Yüzdesi :" + kdvYuzdesi);
        System.out.println("KDV Tutarı :" + kdvTutari);
        System.out.println("KDV'li Fiyat :" + kdvliFiyat);
        System.out.println(kdvliFiyat);


    }
}
