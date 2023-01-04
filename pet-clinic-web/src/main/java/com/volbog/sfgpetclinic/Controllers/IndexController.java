package com.volbog.sfgpetclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(Model model) {
        model.addAttribute("index", "Index Page");
        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler(Model model) {
        return "notImplemented";
    }
}
