import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int bolenToplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                bolenToplam += i;
            }
        }
        if (bolenToplam == sayi) {
            System.out.println(sayi + " Mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
    }
}