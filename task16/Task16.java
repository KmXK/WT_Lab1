package task16;

import task12.models.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task16 {
    public static void main(String[] args) {

        var books = getBooks();
        Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);
        books.sort(titleComparator);
        System.out.println("Sorted by title:");
        outputBooks(books);

        books = getBooks();
        Comparator<Book> titleAuthorComparator = Comparator.comparing(Book::getTitle);
        titleAuthorComparator = titleAuthorComparator.thenComparing(Book::getAuthor);
        books.sort(titleAuthorComparator);
        System.out.println("\nSorted by title, then by author name:");
        outputBooks(books);

        books = getBooks();
        Comparator<Book> authorTitleComparator = Comparator.comparing(Book::getAuthor);
        authorTitleComparator = authorTitleComparator.thenComparing(Book::getTitle);
        books.sort(authorTitleComparator);
        System.out.println("\nSorted by author name, then by title:");
        outputBooks(books);

        books = getBooks();
        Comparator<Book> fullComparator = Comparator.comparing(Book::getAuthor);
        fullComparator = fullComparator.thenComparing(Book::getTitle);
        fullComparator = fullComparator.thenComparingInt(Book::getPrice);
        books.sort(fullComparator);
        System.out.println("\nSorted by author, then by title, then by price:");
        outputBooks(books);
    }

    private static List<Book> getBooks() {
        var book1 = new Book("Some title", "Zaec", 0);
        var book2 = new Book("Awesome title", "Kirill Guydo", 0);
        var book3 = new Book("Title", "Mama", 0);
        var book4 = new Book("Good title", "Papa", 0);
        var book5 = new Book("Some title", "Kirill Guydo", 0);
        var book6 = new Book("Another title", "Dmitry Kudryavcev", 1000);

        var list = new ArrayList<Book>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);

        return list;
    }

    private static void outputBooks(List<Book> books) {
        for (var book : books) {
            System.out.println(book);
        }
    }
}
