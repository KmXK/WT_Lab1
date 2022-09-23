package task14.models;

public class Book implements Cloneable {
    private final String title;
    private final String author;
    private final int price;

    private static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }

        var book = (Book)obj;
        return book.author.equals(author) &&
               book.price == price &&
               book.title.equals(title);
    }

    @Override
    public int hashCode() {
        return title.hashCode() * -122221 + author.hashCode() * 22333 + price;
    }

    @Override
    public String toString() {
        return String.format("Book: %s. Author: %s. Price: %d.", title, author, price);
    }

    @Override
    public Object clone() {
        return new Book(title, author, price);
    }
}
