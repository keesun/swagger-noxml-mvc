package whiteship.modules.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import whiteship.domain.Book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BookRepository {

    @Autowired JdbcTemplate jdbcTemplate;

    public List<Book> getAll() {
        return jdbcTemplate.query("select * from book", new RowMapper<Book>() {
            @Override
            public Book mapRow(ResultSet resultSet, int i) throws SQLException {
                Book book = new Book();
                book.setId(resultSet.getInt("id"));
                book.setContent(resultSet.getString("content"));
                book.setTitle(resultSet.getString("title"));
                book.setIsbn(resultSet.getString("isbn"));
                return book;
            }
        });
    }

    public void add(Book book) {
        jdbcTemplate.update("insert into book (title, isbn, content) values (?, ?, ?)"
                , book.getTitle(), book.getIsbn(), book.getContent());
    }

}