package ru.job4j.accident.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    ACCEPTED(1L), REJECTED(2L), COMPLETED(3L);
    private Long id;
}
