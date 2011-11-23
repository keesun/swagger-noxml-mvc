package whiteship.modules.book;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import whiteship.config.AppConfig;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class BookRepositoryTest {

    @Autowired BookRepository repository;
    @Autowired BookService bookService;
    @Autowired(required = false) BookController bookController;
    @Autowired(required = false) AppConfig appConfig;

    @Test
    public void di(){
        assertThat(bookController, is(nullValue()));
        assertThat(appConfig, is(notNullValue()));
    }
}
