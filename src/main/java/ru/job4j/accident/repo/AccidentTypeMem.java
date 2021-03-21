package ru.job4j.accident.repo;

import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.AccidentType;

import java.util.Collection;
import java.util.List;

@Repository
public class AccidentTypeMem implements AccidentTypeRepo {
    @Override
    public Collection<AccidentType> findAllAccidentTypes() {
        return List.of(AccidentType.TWO_CARS, AccidentType.CAR_AND_HUMAN, AccidentType.CAR_AND_BIKE);
    }
}
