package com.RoronaMotzo.Time_tracking_app.domain.persons;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public abstract class Person extends AbstractPersistable<Long> {

    private String firstName;
    private String lastName;


    private String eMailPrivate;

    private String eMailBusiness;

    private final String userName = firstName.substring(0,1) + lastName.substring(0,1);



}
