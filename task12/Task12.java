package task12;

import task12.models.Book;

public class Task12 {
    public static void main(String[] args) {
        var book1 = new Book("Some title", "Kirill Guydo", 0);
        var book2 = new Book("Some title", "Kirill Guydo", 0);
        var book3 = new Book("Another title", "Dmitry Kudryavcev", 1000);

        System.out.printf("Books: \n%s\n%s\n%s\n", book1, book2, book3);

        System.out.printf("\nBook1 equals Book2: %s\nBook2 equals Book3: %s\n",
                book1.equals(book2),
                book2.equals(book3));

        System.out.printf("\nHashcodes:\n[1] = %d\n[2] = %d\n[3] = %d\n",
                book1.hashCode(),
                book2.hashCode(),
                book3.hashCode());
    }
}
