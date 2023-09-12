import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Book> shortBook = new TreeSet<>();

        Book book1 =new Book("Tutunamayanlar","Oğuz Atay",671,1971);
        Book book2 =new Book("Calıkuşu","Reşat Nuri Güntekin",409,1922);
        Book book3 =new Book("Eylül","Mehmet Rauf",500,1901);
        Book book4 =new Book("Serenad","Zülfü Livaneli",481,2011);
        Book book5 =new Book("Sinekli Bakkal","Halide Edip Adıvar",208,1936);

        shortBook.add(book1);
        shortBook.add(book2);
        shortBook.add(book3);
        shortBook.add(book4);
        shortBook.add(book5);

        System.out.println("Kitap ismine göre sıralama : ");
        for (Book bookName : shortBook) {
            System.out.println("Kitap Adı: " + bookName.getName() +
                    ", Yazar Adı: " + bookName.getAuthor() +
                    ", Sayfa Sayısı: " + bookName.getPages() +
                    ", Yayım Yılı: " + bookName.getDates() );
        }
        System.out.println("#############################################################################");

        Set<Book> shortBook2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPages() == o2.getPages()){
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getPages()- o2.getPages();
            }
        });
        shortBook2.add(book1);
        shortBook2.add(book2);
        shortBook2.add(book3);
        shortBook2.add(book4);
        shortBook2.add(book5);

        System.out.println("Kitap sayfa sayısına göre sıralama : ");
        for (Book num : shortBook2){
            System.out.println("Kitap Adı " + num.getName()+
                    ", Yazar Adı: " + num.getAuthor()+
                    ", Sayfa Sayısı: " + num.getPages()+
                    ", Yayım Yılı: " + num.getDates());
        }
    }}