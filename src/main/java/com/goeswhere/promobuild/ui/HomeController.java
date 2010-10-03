package com.goeswhere.promobuild.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public void home(Model m) {
    	m.addAttribute("title", "Welcome to pony");
    	m.addAttribute("message", "Hello World!");
    }

    @RequestMapping("/")
    public String slash() {
        return "redirect:home";
    }
}
