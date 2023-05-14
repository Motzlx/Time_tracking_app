package com.RoronaMotzo.Time_tracking_app.persistence;

import com.RoronaMotzo.Time_tracking_app.domain.persons.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
