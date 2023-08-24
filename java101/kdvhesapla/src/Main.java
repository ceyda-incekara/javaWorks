import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ücreti Giriniz: ");
        tutar = inp.nextDouble();

        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;
        
        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " +  kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);



    }
}