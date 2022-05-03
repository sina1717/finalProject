package org.maktab.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data


public class SubService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String name;

    private String description;

    @ManyToOne
    private Service service;

    private Integer baseSalary;

}
