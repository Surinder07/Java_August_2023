package oct14;

public class Book {
    String title;
    String author;
    int numOfPages;

    public Book(String title, String author, int numOfPages) {
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
    }


    public void showDetails(){
        System.out.println("Title " + title);
        System.out.println("Author " + author);
        System.out.println("Num of pages " + numOfPages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title:'" + title + '\'' +
                ", author:'" + author + '\'' +
                ", numOfPages:" + numOfPages +
                '}';
    }
}

/*

 Book    private String title;
    private String author;
    private int numOfPages;
 |
 SciFi
  private String genre;
 |
 Alien
  private int price;
    private boolean isAvailable;




 */