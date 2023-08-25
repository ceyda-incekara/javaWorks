import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        N haneli bir sayının basamaklarının n'inci üstlerinin toplamı,
        sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
         Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
         Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = input.nextInt();
        int basSayi = 0;
        int tempSayi = sayi;
        int basDeger;
        int sonuc = 0;
        int basUs;

        while (tempSayi != 0){
            tempSayi /= 10;
            basSayi++;
        }
        tempSayi = sayi;
        while (tempSayi != 0){
            basDeger= tempSayi % 10;
            basUs = 0;
            for (int i = 1; i<= basSayi; i++){
                basUs *= basDeger;
            }
            sonuc +=basUs;
            tempSayi /= 10;
        }
        if (sonuc == sayi){
            System.out.println(sayi + " sayısı bir armstrong sayıdır.");
        }else {
            System.out.println(sayi + " sayısı bir armstrong sayısı değildir.");
        }


    }
}