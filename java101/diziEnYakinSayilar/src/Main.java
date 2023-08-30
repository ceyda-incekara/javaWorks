import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        int boyut = scanner.nextInt();

        int[] dizi = new int[boyut];

        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = scanner.nextInt();
        }

        System.out.print("Bir sayı girin: ");
        int hedefSayi = scanner.nextInt();

        Arrays.sort(dizi);
        int enKucukYakin = -1; // En yakın küçük sayı
        int enBuyukYakin = -1; // En yakın büyük sayı

        for (int eleman : dizi) {
            if (eleman < hedefSayi) {
                enKucukYakin = eleman;
            } else {
                enBuyukYakin = eleman;
                break; // Hedef sayıyı geçtiğimiz noktada çıkıyoruz
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + enKucukYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + enBuyukYakin);
    }
}