package com.RoronaMotzo.Time_tracking_app.domain;

import com.RoronaMotzo.Time_tracking_app.domain.persons.Employee;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.util.List;


@Entity
@Builder
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Department extends AbstractPersistable<Long> {


    private String departmentName;

    @OneToMany
    private List<Employee> employees;




}
