package objectClass;

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

    @Override
    public String toString() {
        return this.name + ", " + this.author + ", год издания: " + yearPublic;
    }
}
