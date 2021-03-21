package ru.job4j.accident.repo;

import ru.job4j.accident.model.AccidentType;

import java.util.Collection;

public interface AccidentTypeRepo {
    Collection<AccidentType> findAllAccidentTypes();
}
