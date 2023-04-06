package bg.fmi.course.wdwj.service;

import bg.fmi.course.wdwj.model.Book;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public interface BookService {

    /**
     * Add book to the store
     * @param o is the book which we want to add
     * @return true is the book is add successful and false is the book is already exists
     */
    boolean add(Book o);

    /**
     * Remove specific book from the store
     * @param o is the book which we want to remove
     */
    void remove(Book o);

    /**
     *  Get all books by Author
     * @param author
     * @return
     */
    List<Book> getAllBooksByAuthor(String author);

    /**
     * Get all books publish after specific year
     * @param from
     * @return
     */
    List<Book> getAllBooksPublishedAfter(LocalDate from);

    /**
     * Return all books between two dates
     * @param from
     * @param to
     * @return
     */
    List<Book> getAllBooksBetween(LocalDate from, LocalDate to);

    /**
     * Clear the whole book store
     */
    void clear();

    /**
     * Return all books grouped by author
     * @return
     */
    Map<String, List<Book>> getAllBooksGroupByAuthor();


    /**
     * Return all books grouped by publisher
     * @return
     */
    Map<String, List<Book>> getAllBooksGroupByPublisher();

    /**
     * Filter books by given filter
     * @param bookPredicate
     * @return
     */
    List<Book> getAllBooksFilterBy(Predicate<Book> bookPredicate);

}