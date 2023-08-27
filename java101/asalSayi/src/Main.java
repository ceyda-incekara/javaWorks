public class Main {
    public static void main(String[] args) {
        // 1-100 arasındaki asal sayılar
        System.out.println("Asal Sayılar : ");

        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asalMi = true;
            for (int bolen = 2; bolen <= Math.sqrt(sayi); bolen++) {
                if (sayi % bolen == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) {
                System.out.print(sayi + " ");
        }
    }
}}
