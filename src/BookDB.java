public class BookDB {

    public static void main(String[] args){

        Book one = new Book("Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.50);
        Book two = new Book("Thinking in Java", "Bruce Eckel", "Details about Java under the hood", 20.00);
        Book three = new Book("OCP: Oracle Certified Professional Java SE", "KJeanne Boyarsky", "Everything you need to know in one place", 45.00);
        Book four = new Book("Automate the Boring Stuff with Python", "Al Sweigart", "Fun with Python", 10.50);
        Book five = new Book("The Maker's Guide to the Zombie Apocalypse", "KSimon Monk", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50);
        Book six = new Book("Raspberry Pi Projects for the Evil Genius", "Donald Norris", "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75);

        SKU Java1001 = new SKU("Java1001", one);
        SKU Java1002 = new SKU("Java1002", two);
        SKU Orcl1003 = new SKU("Orcl1003\t", three);
        SKU Python1004	= new SKU("Python1004", four);
        SKU Zombie1005 = new SKU("Zombie1005", five);
        SKU Rasp1006 = new SKU("Rasp1006", six);


        System.out.println("SKU \t\t Title \t\t Author \t\t Description \t\t Price");
        System.out.println(Java1001.toString());
        System.out.println(Java1002.toString());
        System.out.println(Orcl1003.toString());
        System.out.println(Python1004.toString());
        System.out.println(Zombie1005.toString());
        System.out.println(Rasp1006.toString());


    }
}
