import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        double toplamFiyat;

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        System.out.print("Armut kaç kilo? : ");
        armutKilo = input.nextInt();

        System.out.print("Elma kaç kilo ? :");
        elmaKilo = input.nextInt();

        System.out.print("Domates kaç kilo ? :");
        domatesKilo = input.nextInt();

        System.out.print("Muz kaç kilo ? :");
        muzKilo = input.nextInt();

        System.out.print("Patlıcan kaç kilo ? :");
        patlicanKilo = input.nextInt();

        toplamFiyat = (armutFiyat * armutKilo) + (elmaFiyat * elmaKilo) + (domatesFiyat * domatesKilo) + (muzFiyat * muzKilo) + (patlicanFiyat * patlicanKilo);
        System.out.println("Toplam Tutar : " + toplamFiyat);
    }
}