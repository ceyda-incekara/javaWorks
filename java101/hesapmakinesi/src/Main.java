import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s1, s2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        s1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        s2 = input.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        if(select == 1 ){
            System.out.println("Toplam : " + (s1 + s2));
        } else if (select == 2){
            System.out.println("Çıkarma : " + (s1 - s2));
        } else if (select == 3){
            System.out.println("Çarpma : " + (s1 * s2));
        } else if (select == 4) {
            if (s2 != 0){
            System.out.println("Bölme : " + (s1 / s2));
            }else {
                System.out.println("Bir sayı 0'a bölünemez.");
            }
        }
        else {
            System.out.println("Yanlış seçim yaptınız.Tekrar deneyiniz.");
        }}}