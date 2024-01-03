package org.generation.jaita99.hellospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
@RequestMapping("/")
public class IndexController {

    // Metodo che restituisce un numero random da un lancio di un dado
    @GetMapping
    public String index(@RequestParam int dice, Model model) {

        Random random = new Random();
        int randomNumber = random.nextInt(1, (dice + 1));

        // Aggiungo l'attributo
        model.addAttribute("number", randomNumber);
        return "home";
    }
}
