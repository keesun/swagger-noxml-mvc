package whiteship.modules.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.rtf.RTFEditorKit;
import java.awt.print.Book;
import java.util.List;

@Service
public class BookService {

    @Autowired BookRepository repository;

    public List<Book> getAll() {
        return  repository.getAll();
    }

}
