package ru.job4j.accident.repo;

import ru.job4j.accident.model.Status;

import java.util.Collection;

public interface StatusRepo {
    Collection<Status> findAllStatuses();
}
