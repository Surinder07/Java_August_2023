package oct14;

public class AlienOrigin extends SciFiBooks{
    private int price;
    private boolean isAvailable;

    public AlienOrigin(String title, String author, int numOfPages, String genre, int price, boolean isAvailable) {
        super(title, author, numOfPages, genre);
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "AlienOrigin{" +
                "price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
