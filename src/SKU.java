public class SKU {
    private String sku;
    private Book book;

    public SKU(String sku, Book book) {
        this.sku = sku;
        this.book = book;
    }

    @Override
    public String toString() {
        return sku + "\t" + book;
    }
}
