package com.songr.songr.Controller;

import com.songr.songr.Model.Capitalized;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CapitalizedController {

    @GetMapping("/capitalize/{word}")
    public String capitalizeTheRoute(Model model, @RequestParam(value = "word") String word){
        Capitalized capitalizedModel = new Capitalized(word);
        model.addAttribute("word", capitalizedModel);
        return "home.html";
    }

}
