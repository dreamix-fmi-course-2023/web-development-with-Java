package bg.fmi.course.wdwj.service.impl;

import bg.fmi.course.wdwj.config.AppConfig;
import bg.fmi.course.wdwj.logger.Logger;
import bg.fmi.course.wdwj.model.Book;
import bg.fmi.course.wdwj.repository.BookRepository;
import bg.fmi.course.wdwj.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

@Slf4j
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final Logger logger;
    private final AppConfig appConfig;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository, Logger logger, AppConfig appConfig) {
        this.bookRepository = bookRepository;
        this.logger = logger;
        this.appConfig = appConfig;
    }

    @Override
    public boolean add(Book book) {
        Book bookByIsbn = bookRepository.getByIsbn(book.getIsbn());
        if (bookByIsbn != null) {
            return false;
        }

        bookRepository.add(book);
        return true;
    }

    @Override
    public void remove(Book o) {
        logger.info("remove");

        log.info("remove");

        logger.info(appConfig.getLogger().getName());
    }

    @Override
    public List<Book> getAllBooksByAuthor(String author) {
        if (author == null || author.isBlank()) {
            return new ArrayList<>();
        }

        return bookRepository.getAllBooksByAuthor(author);
    }

    @Override
    public List<Book> getAllBooksPublishedAfter(LocalDate from) {
        return null;
    }

    @Override
    public List<Book> getAllBooksBetween(LocalDate from, LocalDate to) {
        return null;
    }

    @Override
    public void clear() {
        logger.debug(">>>>>>>>>> clear");

        logger.info(appConfig.getLogger().getName());

        logger.info(appConfig.getDealership().getMaxTaxRate());
    }

    @Override
    public Map<String, List<Book>> getAllBooksGroupByAuthor() {
        return null;
    }

    @Override
    public Map<String, List<Book>> getAllBooksGroupByPublisher() {
        return null;
    }

    @Override
    public List<Book> getAllBooksFilterBy(Predicate<Book> bookPredicate) {
        return null;
    }
}
