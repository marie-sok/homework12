public class Book {
    private final String titleOfTheBook;
    private final Author author;
    private int yearOfPublication;

    public Book(String titleOfTheBook, Author author, int yearOfPublication) {
        this.titleOfTheBook = titleOfTheBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitleOfTheBook() {
        return this.titleOfTheBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + titleOfTheBook + '\'' +
                ", author=" + author.toString() +
                ", year=" + yearOfPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication &&
                titleOfTheBook.equals(book.titleOfTheBook) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = titleOfTheBook.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + yearOfPublication;
        return result;
    }
}

class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstName.equals(author.firstName) &&
                lastName.equals(author.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }
}
