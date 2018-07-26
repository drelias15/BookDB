public class Book {

    private String title;
    private String author;
    private String description;
    private double price;
    private SKU sku;

    public Book(String title, String author, String description, double price, SKU sku) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.sku = sku;
    }

    public SKU getSku() {
        return sku;
    }

    public void setSku(SKU sku) {
        this.sku = sku;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return sku + "\t\t" + title + "\t\t" + author + "\t\t" + description + "\t\t" + price + "\t\t";
    }

public String getDisplayText(){
        return author + title + description;
}
}
