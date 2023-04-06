package bg.fmi.course.wdwj.repository;

import bg.fmi.course.wdwj.config.AppConfig;
import bg.fmi.course.wdwj.model.Book;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Data
@Repository
public class BookRepositoryImpl implements BookRepository {
    @Autowired
    private AppConfig appConfig;

    private Map<String, Book> db = new ConcurrentHashMap<>(); // || new HashMap<>();

    @Override
    public void add(Book book) {
        db.put(book.getIsbn(), book);
    }

    @Override
    public Book getByIsbn(String isbn) {
        return db.get(isbn);
    }

    @Override
    public List<Book> getBooks() {
        return db.values().stream().toList();
    }

    @Override
    public List<Book> getAllBooksByAuthor(String author) {
        return getBooks().stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }


}
