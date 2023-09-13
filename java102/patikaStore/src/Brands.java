import java.util.*;
public record Brands (String brand){
    public static TreeSet<Brands> brandList = new TreeSet<>(new Comparator<Brands>() {
        @Override
        public int compare(Brands o1, Brands o2) {
            String name1 = o1.brand();
            String name2 = o2.brand();
            return name1.compareTo(name2);
        }
    });
    public static TreeSet<Brands> brands(){
        for (Phone say : Phone.phoneList){
            brandList.add(new Brands(say.getBrand()));
        }
        for (Notebook say : Notebook.notebookList){
            brandList.add(new Brands(say.getBrand()));
        }
        return brandList;
    }

    public static void brandPrint(){
        for (Brands say: Brands.brands()){
            System.out.println("- " + say.brand());
        }
    }
}
