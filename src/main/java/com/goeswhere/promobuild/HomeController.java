package com.goeswhere.promobuild;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("message", "Hello World!");
        return mav;
    }

    @RequestMapping("/")
    public String slash() {
        return "redirect:home";
    }
}
