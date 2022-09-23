package task15.models;

public class Book implements Comparable<Book> {
    private String isbn;
    private String title;
    private String author;
    private int price;

    private static int edition;

    public Book(String isbn, String title, String author, int price) {
        this.isbn = isbn;
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
        return String.format("Book [ISBN=%s]: %s. Author: %s. Price: %d.", isbn, title, author, price);
    }

    @Override
    public int compareTo(Book b) {
        return isbn.compareTo(b.isbn);
    }
}
