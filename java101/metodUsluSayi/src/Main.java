import java.util.Scanner;

public class Main {
    static int usAlma(int taban, int us){
        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz : ");
        int taban = input.nextInt();

        System.out.print("Üs değerini giriniz : ");
        int us = input.nextInt();

        int sonuc = usAlma(taban, us);
        System.out.println("Sonuc : " + sonuc);
    }
}