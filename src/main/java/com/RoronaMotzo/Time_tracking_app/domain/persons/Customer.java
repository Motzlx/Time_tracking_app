package com.RoronaMotzo.Time_tracking_app.domain.persons;

import com.RoronaMotzo.Time_tracking_app.domain.Order;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
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
public class Customer extends Person {

    @Column(unique = true)
    @NotBlank
    private Integer customerID;

    @OneToMany
    private List<Order> orders;




}
