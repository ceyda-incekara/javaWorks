public class Book implements Comparable<Book> {
    public String name;
    public String author;
    public int pages;
    public int dates;

    public Book(String name, String author, int pages, int dates) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.dates = dates;
    }

    @Override
    public int compareTo(Book o) {
        return getName().compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getDates() {
        return dates;
    }

    public void setDates(int dates) {
        this.dates = dates;
    }
}
