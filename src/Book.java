import java.util.Objects;

public class Book {

    private String nameBook;
    private Author author;
    private int publishingYear;

    public Book(String nameBook, Author avtor, int publishingYear) {
        this.nameBook = nameBook;
        this.author = avtor;
        this.publishingYear = publishingYear;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }
    public void setPublishingYear(int year) {
        if (year > 1950 && year <= 2024) {
            this.publishingYear = year;
        }
        else {
            System.out.println("Ошибка ввода года издания.");
        }
    }
    @Override
    public String toString() {
        return "Книга - " + nameBook + ", автор - " + author + ", год издания - " + publishingYear;
    }
    @Override
    public boolean equals(Object obj) {
 //       System.out.println(obj.hashCode() + ", " + this.hashCode());
        if (obj.hashCode() != this.hashCode()) return false;
        if (this.getClass() != obj.getClass() || obj == null) return false;
        if (((Book) obj).getNameBook().equals(this.nameBook) &&
                (((Book) obj).getAuthor()).equals((this.author)) &&
                ((Book) obj).getPublishingYear() == (this.getPublishingYear())) {
            return true;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameBook, publishingYear);
    }
}