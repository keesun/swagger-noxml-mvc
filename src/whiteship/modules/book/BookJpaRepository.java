package whiteship.modules.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import whiteship.domain.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author: keesunbaik
 */

//@Repository
public interface BookJpaRepository extends JpaRepository<Book, Integer> {

//    @PersistenceContext EntityManager entityManager;
//
//    public List<Book> getAll(){
//        return entityManager.createQuery("select book from Book book", Book.class).getResultList();
//    }
//
//
//    public void add(Book book) {
//        entityManager.persist(book);
//    }
//
//    public Book findById(int id){
//        return entityManager.find(Book.class, id);
//    }
//
//    public List<Book> find(int page, int size) {
//        TypedQuery<Book> bookTypedQuery = entityManager.createQuery("select book from Book book", Book.class);
//        bookTypedQuery.setFirstResult(page*size);
//        bookTypedQuery.setMaxResults(size);
//        return bookTypedQuery.getResultList();
//    }
//
//    public List<Book> findByTitle(String title, int page, int size) {
//        TypedQuery<Book> bookTypedQuery = entityManager.createQuery("select book from Book book where book.title = ?1", Book.class);
//        bookTypedQuery.setParameter(1, title);
//        bookTypedQuery.setFirstResult(page * size);
//        bookTypedQuery.setMaxResults(size);
//        return bookTypedQuery.getResultList();
//    }

    Book findByTitle(String keesun);

    Book find(Book exampleBook);
}
