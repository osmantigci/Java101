import java.util.Scanner;

public class Manav {
    public static void main (String[] args) {
        double armut, elma, domates, muz, patlican, toplam;
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5;

        Scanner kilo = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? : ");
        armut = kilo.nextDouble();

        System.out.print("Elma kaç kilo ? : ");
        elma = kilo.nextDouble();

        System.out.print("Domates kaç kilo ? : ");
        domates = kilo.nextDouble();

        System.out.print("Muz kaç kilo ? : ");
        muz = kilo.nextDouble();

        System.out.print("Patlıcan kaç kilo ? : ");
        patlican = kilo.nextDouble();

        toplam = (armutFiyat*armut)+(elmaFiyat*elma)+(domatesFiyat*domates)+(muzFiyat*muz)+(patlicanFiyat*patlican);
        System.out.print("Toplam Tutar: " +toplam + " TL");


    }
}
