package whiteship.modules.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import whiteship.domain.Book;

import java.util.List;

@Service
@Transactional
public class BookService {

    @Autowired BookRepository repository;

    @Transactional(readOnly = true)
    public List<Book> getAll() {
        return repository.getAll();
    }

    public void add(Book book) {
        repository.add(book);
    }
}
