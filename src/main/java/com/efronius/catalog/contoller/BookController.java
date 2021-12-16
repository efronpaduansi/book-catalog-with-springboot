package com.efronius.catalog.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

    @GetMapping("/book-list")
    public String findBookList(Model model){
        return "book/book-list";
    }
}
