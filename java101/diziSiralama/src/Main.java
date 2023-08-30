import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int boyut = scan.nextInt();
        int[] dizi = new int[boyut];

        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < boyut; i++){
            System.out.print((i+1) + ". Eleman : ");
            dizi[i] = scan.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println("Sıralama : ");
        for (int eleman : dizi){
            System.out.print(eleman + " ");
        }
    }
}