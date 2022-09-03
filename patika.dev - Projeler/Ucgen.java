import java.util.Scanner;

public class Ucgen {
    public static void main (String[] args) {
        double ilkKenar, ikinciKenar, ucuncuKenar, alan, ucgeninCevresi, u;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Üçgenin ilk kenarını giriniz: ");
        ilkKenar = girdi.nextDouble();

        System.out.print("Üçgenin ikinci kenarını giriniz: ");
        ikinciKenar = girdi.nextDouble();

        System.out.print("Üçgenin üçüncü kenarını giriniz: ");
        ucuncuKenar = girdi.nextDouble();

        ucgeninCevresi = (ilkKenar+ikinciKenar+ucuncuKenar);

        u = ucgeninCevresi / 2;

        alan = Math.sqrt(u*(u-ilkKenar)*(u-ikinciKenar)*(u-ucuncuKenar));
        System.out.print("Üçgenin Alanı: " + alan);

    }
}
