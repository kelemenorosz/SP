package ro.euvt.springtest.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.euvt.springtest.models.Book;

import java.io.Serializable;

@Repository
public interface BookRepository extends CrudRepository<Book, Serializable> {
    public Book findById(int id);
}