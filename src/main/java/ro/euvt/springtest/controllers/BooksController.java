package ro.euvt.springtest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.euvt.springtest.models.*;
import ro.euvt.springtest.persistence.BookService;

@RestController
@RequestMapping(value = "/books", method = RequestMethod.GET)
public class BooksController {

    @Autowired
    private BookService bookService;

    @PostMapping("/save")
    @ResponseBody
    public Book saveBook() {

        Book book = new Book("Flexi Book");

        Book bookResponse = (Book) bookService.saveBook(book);
        return bookResponse;


    }

}
