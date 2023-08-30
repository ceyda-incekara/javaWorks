import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        int boyut = scanner.nextInt();

        double[] dizi = new double[boyut];

        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = scanner.nextDouble();
        }

        double toplamHarmonikSerisi = 0;
        for (double eleman : dizi) {
            toplamHarmonikSerisi += 1 / eleman;
        }

        double harmonikOrtalama = boyut / toplamHarmonikSerisi;
        System.out.println("Dizinin harmonik ortalaması: " + harmonikOrtalama);

    }
}