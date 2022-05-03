package org.maktab.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity

public class Customer extends Person{

    private CustomerStatus status;



    public Customer(Integer id, String email, String firstname, String lastname, String password, CustomerStatus customerStatus, Integer credit) {
        super(id, email, firstname, lastname, password,credit);
        this.status = customerStatus;
    }
}
