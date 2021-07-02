package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    // ask Sprint to inject a BookRepository
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        //through thus constructor it will inject an instance of bookRepository in our controller
        this.bookRepository = bookRepository;
    }

    /**
     * map to specific url
     * @return
     */
    @RequestMapping("/books")
    public String getBooks(Model model){
        //add a list of books to model provided by Spring
        model.addAttribute("books", bookRepository.findAll());
        return "books/list";
    }
}
