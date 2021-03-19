package ru.job4j.accident.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexControl {
    @GetMapping("/")
    public String index(Model model) {
        List<String> list = List.of("Chery",
                "CheryExeed",
                "Chevrolet",
                "Chrysler",
                "Citroen",
                "Dacia",
                "Daewoo",
                "Daihatsu",
                "Datsun");
        model.addAttribute("marks", list);
        return "index";
    }
}