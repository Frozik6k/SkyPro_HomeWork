package objectClass;

import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearPublic;

    public Book(String name, Author author, int yearPublic) {
        this.name = name;
        this.author = author;
        this.yearPublic = yearPublic;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublic() {
        return this.yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }
    public String toString() {
        return this.name + ", " + this.author + ", год издания: " + yearPublic;
    }
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return this.author.equals(book.author)
            && this.name.equals(book.name)
            && this.yearPublic == book.yearPublic;
    }
    public int hashCode() {
        return java.util.Objects.hash(author, name, yearPublic);
    }
}
