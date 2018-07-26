import java.util.ArrayList;

public class BookDBApp {


    public static void main(String[] args){

        // Create a new BookDB Object
        BookDB one = new BookDB();
        SKU Java1001 = new SKU("Java1001");
        SKU Java1002 = new SKU("Java1002");



        Book book1 = new Book("Title", "Author", "Description", 47.50, Java1001);
        Book book2 = new Book("Title", "Author", "Description", 47.50, Java1002);


        ArrayList<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);

       one.setBook(books);


       //System.out.println(one.getBook().contains(book1));


        // Print the BookDB object with a list of books
        for (int i=0; i<one.getBook().size(); i++) {
            //  System.out.println(bookarr.get(i)) ;
            System.out.println(one.getBook().get(i));
        }



    }
}
