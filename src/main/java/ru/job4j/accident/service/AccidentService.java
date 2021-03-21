package ru.job4j.accident.service;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.job4j.accident.dto.AccidentDto;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.model.AccidentType;
import ru.job4j.accident.model.Rule;
import ru.job4j.accident.model.Status;
import ru.job4j.accident.repo.AccidentRepo;
import ru.job4j.accident.repo.AccidentTypeRepo;
import ru.job4j.accident.repo.RuleRepo;
import ru.job4j.accident.repo.StatusRepo;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AccidentService {
    private final AccidentRepo accidentRepo;
    private final StatusRepo statusRepo;
    private final AccidentTypeRepo accidentTypeRepo;
    private final RuleRepo ruleRepo;
    private final ModelMapper modelMapper;

    private static final Logger log = LoggerFactory.getLogger(AccidentRepo.class);

    public AccidentDto findAccidentById(Long id) {
        return this.convertToDto(accidentRepo.findAccidentById(id));
    }

    public List<AccidentDto> findAllAccidents() {
        return accidentRepo.findAllAccidents()
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private AccidentDto convertToDto(Accident accident) {
        return modelMapper.map(accident, AccidentDto.class);
    }

    public void create(Accident accident) {
        this.accidentRepo.create(accident);
    }

    public void update(Accident accident) {
        accidentRepo.update(accident);
    }

    public Collection<Status> findAllStatuses() {
        return statusRepo.findAllStatuses();
    }

    public Collection<AccidentType> findAllAccidentTypes() { return accidentTypeRepo.findAllAccidentTypes(); }

    public Collection<Rule> findAllRules() { return ruleRepo.findAllRules(); }

    public Set<Rule> findRulesByIds(String[] ids) {
        Set<Long> rIds = Set.of(ids).stream().map(Long::parseLong).collect(Collectors.toSet());
        return ruleRepo.findRulesByIds(rIds);
    }
}
