import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, years, yolTip;
        double perKm = 0.10, normalTutar, iTutar, yasiTutar, ggiTutar, total;
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek Mesafeyi Giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı Giriniz : ");
        years = input.nextInt();

        System.out.print("Yolculuk Tipini Belirtiniz : ");
        System.out.print("Tek Yön için 1, Gidiş Dönüş İçin 2 :");
        yolTip = input.nextInt();

        if(yolTip!=1 && yolTip!=2){
            isError=true;
            System.out.print("Hatalı veri girdiniz! ");
        }else {
            normalTutar = perKm * km;
            if (yolTip == 2) {
                ggiTutar = normalTutar * 0.20;
                normalTutar = (normalTutar - ggiTutar) * 2;
            if (years < 12) {
                yasiTutar = normalTutar * 0.50;
                iTutar = normalTutar - yasiTutar;
                System.out.println("Toplam Ücret : " + iTutar + "TL");
            } else if (years <= 24) {
                yasiTutar = normalTutar * 0.10;
                iTutar = normalTutar - yasiTutar;
                System.out.println("Toplam Ücret : " + iTutar + "TL");
            } else if (years > 65) {
                yasiTutar = normalTutar * 0.30;
                iTutar = normalTutar - yasiTutar;
                System.out.println("Toplam Ücret : " + iTutar + "TL");
            }else {
                System.out.println("Toplam Ücret : " + normalTutar + "TL");
            }}
            if (yolTip == 1){
                if (years < 12){
                    yasiTutar = normalTutar * 0.50;
                    iTutar = normalTutar - yasiTutar;
                    System.out.println("Toplam Ücret : " + iTutar + "TL");
                } else if (years <=24) {
                    yasiTutar = normalTutar * 0.10;
                    iTutar = normalTutar - yasiTutar;
                    System.out.println("Toplam Ücret : " + iTutar + "TL");
                } else if (years > 65) {
                    yasiTutar = normalTutar * 0.30;
                    iTutar = normalTutar - yasiTutar;
                    System.out.println("Toplam Ücret : " + iTutar + "TL");
                }else {
                    System.out.println("Toplam Ücret : " + normalTutar + "TL");
                }
        }
    }}}
