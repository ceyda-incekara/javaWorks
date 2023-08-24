import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kg;
        float  m, vki;

        Scanner kilo = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = kilo.nextInt();

        Scanner boy = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        m = boy.nextFloat();

        vki = kg / (m*m);
        System.out.println("Vücut Kitle İndeksiniz : " + vki);
    }
}