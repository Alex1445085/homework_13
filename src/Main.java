public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Грег ", "Айлс");
        Author author2 = new Author("Николай ", "Гоголь");
        Author aut1 = new Author("Майкл ", "Предко");
        Author aut2 = new Author("Майкл ", "Предко");
        Book book1 = new Book("По стопам господа", author1 , 1977);
        Book book2 = new Book("Вечера на хуторе близ Диканьки", author2, 1956);
        Book book3 = new Book("PIC-мкроконтроллеры", aut1, 2009);
        Book book4 = new Book("PIC-мкроконтроллеры", aut2, 2009);

        System.out.println(book1);
        System.out.println(book2);
        book2.setPublishingYear(2012);
        System.out.println(book2);

        System.out.println(book3);
        System.out.println(book4.equals(book3));
    }
}