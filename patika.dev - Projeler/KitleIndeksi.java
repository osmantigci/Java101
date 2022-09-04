import java.util.Scanner;

public class KitleIndeksi {
    public static void main (String[] args) {
        double kg, boy, indeks;

        Scanner deger = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = deger.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = deger.nextDouble();

        indeks = (kg / (boy*boy));
        System.out.print("Vücut kitle indeksiniz : " +indeks);
    }
}
