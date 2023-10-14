package oct14;

public class SciFiBooks extends Book{

    private String genre;

    public SciFiBooks(String title, String author, int numOfPages, String genre) {
        super(title, author, numOfPages);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "SciFiBooks{" +
                "genre='" + genre + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numOfPages=" + numOfPages +
                '}';
    }
}
