import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        int heat;


        Scanner inp = new Scanner(System.in);
        System.out.println("Sıcaklık kaç derece? \n1-5 dereceden düşük\n2-5 ve 15 derece arasında\n3-15 ve 25 derece arasında\n4-25 dereceden fazla");
        System.out.print("Seçiminiz: ");

        heat = inp.nextInt();


        switch (heat) {
            case 1:
                System.out.print("Hava koşulları kayak yapmak için mükemmel! ");
                break;
            case 2:
                System.out.print("Sinemaya gitmek için güzel bir gün! ");
                break;
            case 3:
                System.out.print("Piknik yapmak çok iyi olur! ");
                break;
            case 4:
                System.out.print("Şimdi yüzme zamanı! ");
                break;
            default:
                System.out.print("Hatalı seçim yaptınız, lütfen tekrar deneyin!");
        }

    }

}
