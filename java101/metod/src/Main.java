import java.util.Scanner;

public class Main {
    static void recursiveIslem(int sayi, int ilkSayi) {
        System.out.println(sayi);

        if (sayi <= 0) {
            recursiveIslemArttir(sayi, ilkSayi);
        } else {
            recursiveIslem(sayi - 5, ilkSayi);
        }
    }
    static void recursiveIslemArttir(int sayi, int ilkSayi) {
        sayi += 5;
        System.out.println(sayi);

        if (sayi <= ilkSayi) {
            recursiveIslemArttir(sayi, ilkSayi);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı : ");
        int n = input.nextInt();
        System.out.println("Çıktısı : ");

        recursiveIslem(n, n);
    }
}