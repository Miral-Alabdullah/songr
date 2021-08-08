package controller;

import model.CapitalizedModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Locale;

@Controller
public class Capitalize {

    @GetMapping("/capitalize/{word}")
    @ResponseBody
    public static String capitalizeTheRoute(Model model, @RequestParam(value = "word") String word){
        CapitalizedModel capitalizedModel = new CapitalizedModel(word);
        model.addAttribute(capitalizedModel);
        return "home.html";
    }

}
