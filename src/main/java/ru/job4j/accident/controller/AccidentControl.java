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
import ru.job4j.accident.model.Rule;
import ru.job4j.accident.model.Status;
import ru.job4j.accident.service.AccidentService;

import javax.servlet.http.HttpServletRequest;
import java.util.Set;

@Controller
@AllArgsConstructor
public class AccidentControl {
    private final AccidentService accidentService;

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("types", accidentService.findAllAccidentTypes());
        model.addAttribute("rules", accidentService.findAllRules());
        return "accident/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Accident accident, HttpServletRequest req) {
        accident.setStatus(Status.ACCEPTED);
        String[] ids = req.getParameterValues("rIds");
        Set<Rule> rules = accidentService.findRulesByIds(ids);
        accident.setRules(rules);
        accidentService.create(accident);
        return "redirect:/";
    }


    @GetMapping("/edit")
    public String edit(@RequestParam(name = "id") String accidentId, Model model) {
        Long id = Long.parseLong(accidentId);
        AccidentDto accident = accidentService.findAccidentById(id);
        model.addAttribute("accident", accident);
        model.addAttribute("statuses", accidentService.findAllStatuses());
        model.addAttribute("types", accidentService.findAllAccidentTypes());
        return "accident/edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Accident accident) {
        accidentService.update(accident);
        return "redirect:/";
    }
}