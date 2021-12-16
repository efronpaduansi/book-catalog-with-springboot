package com.efronius.catalog.contoller;

//untuk memberitahukan servelt kita tambahkan anotasi @controller pada file controller

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //make a method
    @GetMapping("/home")
    public String home(Model model){
       //show HTML files named home
        return "home";
    }

    @GetMapping("about")
    public String about(Model aboutModel){
        aboutModel.addAttribute("aboutMessage", "Hello world from SpringMVC + Thymeleaf");
        return "about";
    }
}
