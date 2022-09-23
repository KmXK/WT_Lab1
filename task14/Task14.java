package task14;

import task14.models.Book;

public class Task14 {
    public static void main(String[] args) {
        var book = new Book("Some title", "Kirill Guydo", 0);

        var clone = book.clone();

        System.out.printf("Book:\n%s\n\n", book);
        System.out.printf("Clone:\n%s\n\n", clone);

        System.out.printf("Book.equals(Clone): %s\nBook == Clone: %s\n", book.equals(clone), book == clone);
    }
}
