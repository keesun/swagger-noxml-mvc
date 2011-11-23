package whiteship.modules.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    @Autowired BookService service;

    @RequestMapping("/")
    public String addForm(Model model) {
        model.addAttribute("book", service.getAll());
        return "bookForm";
    }



}
