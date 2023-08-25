import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü Alıncak Sayı : ");
        n = inp.nextInt();
        System.out.print("Üs Olacak Sayı : ");
        k = inp.nextInt();
        int total = 1;

        int i = 1;
        while (i <= k){
            total *= n;
            i++;
        }
        System.out.println("Sonuç : " + total);
    }
}