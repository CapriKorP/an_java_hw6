
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java", 2022,
                    new Author("Petr", "Petrov", 100), 280);

        System.out.println(book.isBig());
        System.out.println(book.matches("Semenov"));
        System.out.println(book.estimatePrice());




    }
}