package ru.job4j.accident.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(of = "id")
@Data
@NoArgsConstructor
public class Rule {
    private Long id;
    private String name;
}
