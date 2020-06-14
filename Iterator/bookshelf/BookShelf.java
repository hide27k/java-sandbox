import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private List<Book> books;
    public BookShelf(int maxsize) {
        this.books = new ArrayList<>();
    }
    public Book getBookAt(int index) {
        return books.get(index);
    }
    public void appendBook(Book book) {
        this.books.add(book);
    }
    public int getLength() {
        return books.size();
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

}
