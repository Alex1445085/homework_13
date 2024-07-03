public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Грег ", "Айлс");
        Author author2 = new Author("Николай ", "Гоголь");
        Author aut1 = new Author("Вася ", "Пупкин");
        Book book1 = new Book("По стопам господа", author1 , 1977);
        Book book2 = new Book("Вечера на хуторе близ Диканьки", author2, 1956);
        Book book3 = new Book("Вчера в городе", aut1, 1988);

        System.out.print("book1 : " + book1.getNameBook() + ", ");
        System.out.print(book1.getAuthor().getAuthorFirstName() + book1.getAuthor().getAuthorSecondName() + ", ");
        System.out.println(book1.getPublishingYear());
        System.out.print("book2 : " + book2.getNameBook() + ", ");
        System.out.print(book2.getAuthor().getAuthorFirstName() + book2.getAuthor().getAuthorSecondName() + ", ");
        System.out.println(book2.getPublishingYear());
        System.out.print("book3 : " + book3.getNameBook() + ", ");
        System.out.print(book3.getAuthor().getAuthorFirstName() + book3.getAuthor().getAuthorSecondName() + ", ");
        System.out.println(book3.getPublishingYear());

        book2.setPublishingYear(2012);

        System.out.print("book2 : " + book2.getNameBook() + ", ");
        System.out.print(book2.getAuthor().getAuthorFirstName() + book2.getAuthor().getAuthorSecondName() + ", ");
        System.out.println(book2.getPublishingYear());

        System.out.println(book3);
    }
}