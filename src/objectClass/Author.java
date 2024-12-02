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

    @Override
    public String toString() {
        return this.firstname + ' ' + this.surname;
    }
}
