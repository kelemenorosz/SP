package ro.euvt.springtest.persistence;

import org.springframework.stereotype.Component;
import ro.euvt.springtest.models.Book;

@Component
public interface BookService {
    public Book saveBook(Book book);

    public Book findById(int id);

    public Book updateBook(Book book);
}