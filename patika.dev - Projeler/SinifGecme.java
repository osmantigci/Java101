import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;
        int ortalama;
        int dersSayisi = 0;
        int notToplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if (!(mat < 0 || mat > 100)) {
            notToplam += mat;
            dersSayisi++;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if (!(fizik < 0 || fizik > 100)) {
            notToplam += fizik;
            dersSayisi++;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        if (!(turkce < 0 || turkce > 100)) {
            notToplam += turkce;
            dersSayisi++;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if (!(kimya < 0 || kimya > 100)) {
            notToplam += kimya;
            dersSayisi++;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        if (!(muzik < 0 || muzik > 100)) {
            notToplam += muzik;
            dersSayisi++;
        }

        ortalama = notToplam / dersSayisi;

        if (ortalama <= 55) {
            System.out.print("Sınıfta kaldınız, seneye görüşmek üzere! ");
        } else {
            System.out.print("Tebrikler, sınıfı geçtiniz! ");
        }

        System.out.print("Ortalamanız :" + ortalama);
    }

}
