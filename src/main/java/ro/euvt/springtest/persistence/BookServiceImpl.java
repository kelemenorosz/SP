package ro.euvt.springtest.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.euvt.springtest.models.Book;

@Service("bookServiceImpl")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Transactional
    public Book saveBook(Book book) {
        Book bookResponse = bookRepository.save(book);
        return bookResponse;
    }

    @Transactional
    public Book findById(int id) {
        Book bookResponse = bookRepository.findById(id);
        return bookResponse;
    }

    @Transactional
    public Book updateBook(Book book) {
        Book bookResponse = bookRepository.save(book);
        return bookResponse;
    }

}