package task12.models;

public class Book {
    private String title;
    private String author;
    private int price;

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
        return book.getAuthor().equals(getAuthor()) &&
               book.getPrice() == getPrice() &&
               book.getTitle().equals(getTitle());
    }

    @Override
    public int hashCode() {
        return getTitle().hashCode() * -122221 + getAuthor().hashCode() * 22333 + getPrice();
    }

    @Override
    public String toString() {
        return String.format("Book: %s. Author: %s. Price: %d.", getTitle(), getAuthor(), getPrice());
    }
}
