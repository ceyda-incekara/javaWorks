import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int elemanSayisi = input.nextInt();

        int fib1 = 0, fib2 = 1;

        System.out.print("Fibonacci Serisi: ");

        for (int i = 1; i <= elemanSayisi; i++) {
            System.out.print(fib1 + " ");

            int yeniFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = yeniFib;
        }

    }
}