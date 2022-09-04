import java.util.Scanner;

public class Daire {
    public static void main (String[] args) {

        // Değişkenleri tanımladık
        double r, alan, cevre, pi = 3.14, angle;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarıçapı : ");
        r = inp.nextDouble();

        System.out.print("Daire diliminin açısı : ");
        angle = inp.nextDouble();

        alan = ((pi*r*r*angle)/360);
        System.out.print("Dairenin alanı : " +alan);

    }
}
