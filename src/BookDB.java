import java.util.ArrayList;

public class BookDB {

    private ArrayList<Book> bookList;

    public BookDB() {
        bookList = new ArrayList<>();
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
    // Create a search function here that looks for a book of a specific SKU in your arraylist

    public String display(String input){
        for(int i=0; i<bookList.size();i++) {
            Book picked = bookList.get(i);
            if (input == picked.getSku()
        }
    }
}



