package ru.job4j.accident.service;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.job4j.accident.dto.AccidentDto;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repo.AccidentRepo;

import java.util.List;

import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AccidentService {
    private final AccidentRepo accidentRepo;
    private final ModelMapper modelMapper;
    private static final Logger log = LoggerFactory.getLogger(AccidentRepo.class);

    public List<AccidentDto> findAllAccidents() {
        return accidentRepo.findAllAccidents()
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private AccidentDto convertToDto(Accident accident) {
        return modelMapper.map(accident, AccidentDto.class);
    }
}
