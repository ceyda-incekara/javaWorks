import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int years;
        Scanner inp= new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz : ");
        years = inp.nextInt();

        if (years % 12 == 0 ){
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        }else if (years % 12 == 1 ) {
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        }else if (years % 12 == 2 ) {
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        }else if (years % 12 == 3 ) {
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        }else if (years % 12 == 4 ) {
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        }else if (years % 12 == 5 ) {
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        }else if (years % 12 == 6 ) {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        }else if (years % 12 == 7 ) {
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");
        }else if (years % 12 == 8 ) {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        }else if (years % 12 == 9 ) {
            System.out.println("Çin Zodyağı Burcunuz : Yılan");
        }else if (years % 12 == 10 ) {
            System.out.println("Çin Zodyağı Burcunuz : At");
        }else if (years % 12 == 11 ) {
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }
    }
}