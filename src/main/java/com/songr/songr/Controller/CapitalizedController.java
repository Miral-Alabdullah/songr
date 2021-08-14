package com.songr.songr.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CapitalizedController {

    @GetMapping("/capitalize/{word}")
    public String capitalizeTheRoute(@PathVariable String word, Model model){
        model.addAttribute("word", word.toUpperCase());
        return "home.html";
    }

}
