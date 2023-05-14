package com.RoronaMotzo.Time_tracking_app.domain.persons;

import com.RoronaMotzo.Time_tracking_app.domain.enums.JobTitle;
import com.RoronaMotzo.Time_tracking_app.domain.objects.TimeTracking;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
@Data
@Builder

public class Employee extends Person {

    @OneToMany
    private List<TimeTracking> timeTrackingList;

    private Integer socialSecurityNumber;

    private Double salary;

    private JobTitle jobTitle;


}
