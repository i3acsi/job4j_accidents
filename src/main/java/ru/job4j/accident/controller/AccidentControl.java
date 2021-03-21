package ru.job4j.accident.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.job4j.accident.dto.AccidentDto;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repo.AccidentRepo;
import ru.job4j.accident.service.AccidentService;

@Controller
@AllArgsConstructor
public class AccidentControl {
    private final AccidentService accidentService;

    @GetMapping("/create")
    public String create() {
        return "accident/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Accident accident) {
        accidentService.create(accident);
        return "redirect:/";
    }


    @GetMapping("/edit")
    public String edit(@RequestParam(name = "id") String accidentId, Model model) {
        Long id = Long.parseLong(accidentId);
        AccidentDto accident = accidentService.findAccidentById(id);
        model.addAttribute("accident", accident);
        return "accident/edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Accident accident) {
        accidentService.update(accident);
        return "redirect:/";
    }
}