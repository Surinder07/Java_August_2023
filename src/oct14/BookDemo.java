package oct14;

public class BookDemo {
    public static void main(String[] args) {

        Book book = new Book("Head First Java", "Asher", 500);
        System.out.println(book);
        System.out.println();

        SciFiBooks sciFiBooks =
                new SciFiBooks("Harry Potter", "JK Rowling",1000,"Sci fi");

        System.out.println(sciFiBooks);
        System.out.println();

        AlienOrigin alienOrigin =
                new AlienOrigin("Gardian of Galaxy","Marvel",2000,"Action",20,true );

        System.out.println();
        System.out.println(alienOrigin);
    }
}
