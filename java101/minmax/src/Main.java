import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter;
        System.out.print("Kaç tane sayı gireceksiniz : ");
        counter = input.nextInt();

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < counter; i++) {
            System.out.print((i + 1) + ". Sayıyı giriniz: ");
            int number = input.nextInt();

            if (number < minNumber) {
                minNumber = number;
            }

            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println("En büyük sayı: " + maxNumber);
        System.out.println("En küçük sayı: " + minNumber);
    }
}