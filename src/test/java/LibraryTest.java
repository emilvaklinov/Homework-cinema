import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book1;
    Book book2;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book(BookGenre.THRILLER);
        book2 = new Book(BookGenre.CRIME);
    }

    @Test
    public void hasBookEmpty() { assertEquals(0, library.bookCount());}

    @Test
    public void canGetBook(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
        library.removeBook();
        assertEquals(0, library.bookCount());
    }
}
