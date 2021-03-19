package ru.job4j.accident.model;

import java.util.Set;

public class Accident {
    private Long id;
    private String address;
    private String carNumber;
    private String description;
    private Set<String> photos;
    private Status status;
}
