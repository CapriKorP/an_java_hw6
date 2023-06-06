
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java", 2022, 80);

        System.out.println(book.isBig());
        System.out.println(book.matches("Petrov"));
        System.out.println(book.estimatePrice());


        Book book1 = new Book("Java", 2022, 500);

        System.out.println(book1.isBig());
        System.out.println(book1.matches("Ivanov"));
        System.out.println(book1.estimatePrice());
    }
}