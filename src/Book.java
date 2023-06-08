
public class Book {
    public String title;
    ;
    public int releaseYear;
    Author author;

    public int pages;


    public Book(String title, int releaseYear,Author author ,int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }


    public boolean isBig() {
        if (pages >= 500) {
            return true;
        } else {
            return false;
        }
    }

    public boolean matches(String word) {
        if (word.contains(title) || word.contains(author.name) || word.contains(author.surname)){
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