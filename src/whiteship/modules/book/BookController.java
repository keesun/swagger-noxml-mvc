package whiteship.modules.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import whiteship.domain.Book;

@Controller
public class BookController {

    @Autowired BookService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String addForm(Model model) {
        model.addAttribute("books", service.getAll());
        model.addAttribute("book", new Book());
        return "/book";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addSubmit(Book book, Model model) {
        service.add(book);
        return "redirect:/";
    }



}
