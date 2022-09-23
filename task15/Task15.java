package task15;

import task15.models.Book;

import java.util.ArrayList;
import java.util.Collections;

public class Task15 {
    public static void main(String[] args) {
        var books = new ArrayList<Book>();
        books.add(new Book("978-5-9500129-6-9", "Some title2", "Kirill Guydo", 0));
        books.add(new Book("978-0-7475958-2-3","Some title1", "Kirill Guydo", 0));
        books.add(new Book("978-3-1614841-0-0","Another title", "Dmitry Kudryavcev", 1000));

        Collections.sort(books);

        for (var book : books) {
            System.out.println(book);
        }
    }
}
