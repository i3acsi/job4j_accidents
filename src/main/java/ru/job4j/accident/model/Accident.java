package ru.job4j.accident.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@ToString
public class Accident {
    private Long id;
    private String address;
    private String carNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-dd HH:mm:ss", timezone = "Asia/Novosibirsk")
    private Date created = new Date(System.currentTimeMillis());
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-dd HH:mm:ss", timezone = "Asia/Novosibirsk")
    private Date updated = new Date(System.currentTimeMillis());
    private String title;
    private String description;
    private Set<String> photos;
    private Status status;
    private AccidentType accidentType;
}
