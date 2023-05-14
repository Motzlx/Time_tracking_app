package com.RoronaMotzo.Time_tracking_app.persistence;

import com.RoronaMotzo.Time_tracking_app.domain.persons.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
