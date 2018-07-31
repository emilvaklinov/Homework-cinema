import java.util.ArrayList;

public class Library {

    ArrayList<Book>books;
    public Library() {
        books =new ArrayList<Book>();
    }


    public int bookCount() {return this.books.size();}
    public void addBook(Book book) {this.books.add(book);}
    public Book removeBook(){
        return  this.books.remove(0);
    }
}
