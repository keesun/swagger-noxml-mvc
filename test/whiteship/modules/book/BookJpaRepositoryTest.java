package whiteship.modules.book;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import whiteship.config.AppConfig;
import whiteship.domain.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;


/**
 * @author: keesunbaik
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/testContext.xml")
@Transactional
public class BookJpaRepositoryTest {

    @Autowired BookJpaRepository repository;

    @Test
    public void crud(){
        Book book = new Book();
        book.setTitle("Keesun");
        repository.save(book);

        List<Book> bookList = repository.findAll();
        assertThat(bookList.size(), is(1));

        Book myBook = repository.findByTitle("Keesun");
        assertThat(myBook, is(notNullValue()));

        Book exampleBook = new Book();
        exampleBook.setTitle("Keesun");
        Book myNewBook = repository.find(exampleBook);
        assertThat(myNewBook, is(notNullValue()));

    }

}
