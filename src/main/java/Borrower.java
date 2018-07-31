import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book>collection;

    public Borrower(String name){
        this.collection = new ArrayList<Book>();
        this.name = name;
    }

    public int booksCount() { return this.collection.size();}
    public void collect(Book book) { collection.add(book);}
}
