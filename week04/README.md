# Tasks

## Task 0
Create a new Spring Boot project with Spring [initializr](https://start.spring.io/). In the main class implement CommandLineRunner interface.

The goal of the task is to use layered structured architecture and Spring bean definition (IoC)

Package definition:
* labs.week03.model - defined base object structure (Book)
* labs.week03.service - defined the business logic (BookService)
* labs.week03.repository - simulating operation with DB where DB is Map structure. (BookRepository) (you can use list as in the last lab)

Create a Book store program. In the store we can have only one book from the same type.( Same type means book with same author, title and year). Our programm should implement all method from Store interface. 
```
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
```
Also, we have class Book:
```
public class Book {
  private String title;
  private String author;
  private BigDecimal price;
  private String publisher;
  private LocalDate publishedYear;
}
```


## Tasks 1
Create a new Spring Boot project with Spring [initializr](https://start.spring.io/). In the main class implement CommandLineRunner interface. Move the Dealership store logic in the newly create spring boot project. Rewrite object creation with Spring bean definition (IoC). Project definition from last lab -> [DealershipProject](https://github.com/dreamix-fmi-course-2023/web-development-with-Java/tree/main/week03/labs/FMICourse2023/src/com/fmi/week03). Package definition:
* labs.week03.model - defined base object structure (Invoice, Car)
* labs.week03.service - defined the business logic 
* labs.week03.repository - simulating operation with DB where DB is Map structure. 

## Task 2
For your Dealership platform create a simple get all vehicle REST endpoint

Steps:

- add web starter dependency (Additional info: Starter of Spring web uses Spring MVC, REST and Tomcat as a default embedded server. The single spring-boot-starter-web dependency transitively pulls in all dependencies related to web development. It also reduces the build dependency count.)
```
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
```

- create a controller package
- use @RestController (Additional info: you can use @Controller but, @RestController annotation in order to simplify the creation of RESTful web services. It's a convenient annotation that combines @Controller and @ResponseBody, which eliminates the need to annotate every request handling method of the controller class with the @ResponseBody annotation.)
- use @GetMapping (Additional info: Annotation for mapping HTTP GET requests onto specific handler methods. Specifically, @GetMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. GET) .)

Example:
```
@RestController
@RequestMapping("example")
public class SimpleBookRestController {
    
    @GetMapping("/books")
    public Book getBook() {
        return service.getBooks();
    }
}
```