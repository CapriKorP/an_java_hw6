
public class Book {
    public String title;
    // public String author;
    public int releaseYear;

    public int pages;


    public Book(String title, int releaseYear, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
    }

    Author author = new Author("Ivan", "Ivanov", 100);

    public boolean isBig() {
        if (pages >= 500) {
            return true;
        } else {
            return false;
        }
    }

    public boolean matches(String word) {
        if (word.contains(title)) {
            return true;
        } else if (word.contains(author.name) || word.contains(author.surname)){
            return true;
        } else {
            return false;
        }
    }

    public int estimatePrice() {
        int price = pages * 3 * (int) Math.floor(Math.sqrt(author.rating));
        if (price > 250) {
            return price;
        } else {
            return 250;
        }
    }

}