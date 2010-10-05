package com.goeswhere.promobuild.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.goeswhere.promobuild.general.UiMsg;

@Controller
public class HomeController extends LocalisedController {
	@Autowired public HomeController(UiMsg msg) {
		super(msg);
	}

    @RequestMapping("/home")
    public void home(Model m) {
    	m.addAttribute("title", msg.homeTitle());
    }

    @RequestMapping("/")
    public String slash() {
        return "redirect:home";
    }
}
