package org.maktab.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.io.File;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor

public class Proficient extends Person{

    private File photo;

    private ProficientStatus status;

    @ManyToMany
    private Set<SubService> skills;

    private Double Rating;

    public Proficient(Integer id, String email, String firstname, String lastname, String password, Integer credit, File photo, ProficientStatus status, Set<SubService> skills, Double rating) {
        super(id, email, firstname, lastname, password, credit);
        this.photo = photo;
        this.status = status;
        this.skills = skills;
        Rating = rating;
    }
}
