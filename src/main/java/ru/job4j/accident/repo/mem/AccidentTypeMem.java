package ru.job4j.accident.repo.mem;

import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.AccidentType;
import ru.job4j.accident.repo.AccidentTypeRepo;

import java.util.Collection;
import java.util.List;

@Repository
public class AccidentTypeMem implements AccidentTypeRepo {
    @Override
    public Collection<AccidentType> findAllAccidentTypes() {
        return List.of(AccidentType.TWO_CARS, AccidentType.CAR_AND_HUMAN, AccidentType.CAR_AND_BIKE);
    }
}
