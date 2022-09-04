import java.util.Scanner;

public class Taksimetre {
    public static void main (String[] args) {
        double gidilenKm, totalUcret, kmUcreti = 2.20;
        int minUcret = 20, acilisUcreti = 10;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden yazınız : ");
        gidilenKm = inp.nextDouble();

        totalUcret = (acilisUcreti + (gidilenKm * kmUcreti));
        totalUcret = (totalUcret < 20) ? minUcret : totalUcret;
        System.out.print("Total Ücret: " +totalUcret);


    }
}
