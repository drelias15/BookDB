import java.util.ArrayList;

public class BookDB {

    private ArrayList<Book> BookDB;

    public BookDB() {
        BookDB = new ArrayList<>();
    }

    public ArrayList<Book> getBook() {
        return BookDB;
    }

    public void setBook(ArrayList<Book> book) {
        this.BookDB = book;
    }


}
