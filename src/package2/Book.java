package package2;

import java.time.LocalDate;

public class Book {
    private long id;
    private String bookName;
    private int price;
    private String genre;
    private int createDate;

    public Book(long id, String bookName, int price, String genre, int createDate) {
        this.id = id;
        this.bookName = bookName;
        this.price = price;
        this.genre = genre;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return  "Book" +
                "\nID: " + id +
                "\nName: " + bookName +
                "\nPrice: " + price +
                "\nGenre: " + genre +
                "\nCreate Date: " + createDate +
                "\n--------------";

    }
}
