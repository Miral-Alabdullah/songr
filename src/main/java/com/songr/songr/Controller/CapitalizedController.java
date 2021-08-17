package com.songr.songr.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class CapitalizedController {

    @GetMapping("/capitalize/{word}")
    public String capitalizeTheRoute(@PathVariable String word, Model model){
        model.addAttribute("word", word.toUpperCase());
        return "capitalized.html";
    }

}
