import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak Sayısı: ");
        int basamakSayisi = input.nextInt();

        for (int i = basamakSayisi; i >= 1; i--) {
            for (int j = 1; j <=  (basamakSayisi - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println(); // Bir alt satıra geç
        }
    }
}