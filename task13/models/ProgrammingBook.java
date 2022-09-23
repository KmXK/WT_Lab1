package task13.models;

import task12.models.Book;

public class ProgrammingBook extends Book {
    private String language;
    private int level;

    public ProgrammingBook(String title, String author, int price, String language, int level) {
        super(title, author, price);

        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + getLanguage().hashCode() + getLevel() * 2;
    }

    @Override
    public String toString() {
        return String.format("Programming %s Language: %s. Level: %d.", super.toString(), getLanguage(), getLevel());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }

        var book = (ProgrammingBook)obj;
        return  book.getAuthor() == getAuthor() &&
                book.getPrice() == getPrice() &&
                book.getTitle() == getTitle() &&
                book.getLanguage().equals(getLanguage()) &&
                book.getLevel() == getLevel();
    }
}
