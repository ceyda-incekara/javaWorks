import java.util.Comparator;
import java.util.TreeSet;

public class Database {
    public static TreeSet<Phone> phoneList = new TreeSet<>(new Comparator<Phone>() {
        @Override
        public int compare(Phone o1, Phone o2) {
            int id1 = o1.getId();
            int id2 = o2.getId();
            return id1 - id2;
        }
    });
    public static TreeSet<Notebook> notebookList = new TreeSet<>(new Comparator<Notebook>() {
        @Override
        public int compare(Notebook o1, Notebook o2) {
            int id1 = o1.getId();
            int id2 = o2.getId();
            return id1 - id2;
        }
    });
    private final int unitPrice;//birim fiyatı
    private final int discountRate;//indirim oranı
    private final int amount;//Stok miktarı
    private final String productName;//Ürün adı
    private final String brand;//Marka adı
    private final String screenSize; //Ekran Boyutu
    private final String ram;

    public Database(int unitPrice, int discountRate, int amount, String productName, String brand, String screenSize, String ram) {
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.amount = amount;
        this.productName = productName;
        this.brand = brand;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public int getUnitPrice() {
        return this.unitPrice;
    }

    public int getDiscountRate() {
        return this.discountRate;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getScreenSize() {
        return this.screenSize;
    }

    public String getRam() {
        return this.ram;
    }
}