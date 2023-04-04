package bg.fmi.course.wdwj;

import bg.fmi.course.wdwj.model.Book;
import bg.fmi.course.wdwj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class WdwjApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(WdwjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(">>>>>>>>>>> ");
//		Book book = new Book();
//		book.setAuthor("ASD");
//		book.setIsbn("ISBNASD");
//
//		bookService.add(book);
//
//		List<Book> booksByAuthor = bookService.getAllBooksByAuthor("ASD");
//		booksByAuthor.stream().forEach(System.out::println);

		System.out.println(">>>>");
		bookService.clear();

	}
}
