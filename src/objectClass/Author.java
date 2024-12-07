package objectClass;

public class Author {
    private String firstname;
    private String surname;

    public Author(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getSurname() {
        return this.surname;
    }
    public String toString() {
        return this.firstname + ' ' + this.surname;
    }
    public boolean equals(Author author) {
        return this.firstname.equals(author.getFirstname())
            && this.surname.equals(author.getSurname());
    }
    public int hashCode() {
        return java.util.Objects.hash(firstname.hashCode(), surname.hashCode());
    }
}
