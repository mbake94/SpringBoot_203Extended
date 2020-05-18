package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class PersonController {
    @GetMapping("/loadperson")
    public String loadperson(Model model){
        model.addAttribute("newPerson", new Person());
        return "loadperson";
    }
    @PostMapping("/loadperson")
    public String processPerson(@ModelAttribute Person person, Model model){
        model.addAttribute("personln", person);
        return "confirmperson";
    }
}

