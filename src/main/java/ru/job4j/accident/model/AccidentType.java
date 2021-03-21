package ru.job4j.accident.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AccidentType {
    TWO_CARS(1L), CAR_AND_HUMAN(2L), CAR_AND_BIKE(3L);
    private Long id;
}
