package ru.job4j.accident.repo;

import ru.job4j.accident.model.Accident;

import java.util.Collection;

public interface AccidentRepo {
    Collection<Accident> findAllAccidents();

    void create(Accident accident);

    Accident findAccidentById(Long id);
}
