import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Book book1;
    Book book2;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower("Emil");
        book1 = new Book(BookGenre.THRILLER);
        book2 = new Book(BookGenre.CRIME);
        library = new Library();
        library.addBook(book1);
    }

    @Test
    public void borrowerStartsEmpty() { assertEquals(0, borrower.booksCount());}

    @Test
    public void canCollectBook(){
        borrower.collect(book1);
        assertEquals(1, borrower.booksCount());
    }
}
