package ru.job4j.accident.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Data
@NoArgsConstructor
@ToString
public class AccidentDto {
    private Long id;
    private String address;
    private String carNumber;
    private String created;
    private String updated;
    private String title;
    private String description;
    private String photo;
    private Set<String> photos;
    private String status;
    private String accidentType;

    public void setPhotos(Set<String> photos){
        this.photos = photos;
        if (photos !=null && photos.size()!=0)
            this.photo = photos.iterator().next();
    }
}