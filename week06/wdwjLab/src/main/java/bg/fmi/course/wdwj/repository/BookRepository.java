package bg.fmi.course.wdwj.repository;

import bg.fmi.course.wdwj.model.Book;

import java.util.List;
import java.util.Map;

public interface BookRepository {

    void add(Book book);

    Book getByIsbn(String isbn);

    List<Book> getBooks();

    List<Book> getAllBooksByAuthor(String author);
}
