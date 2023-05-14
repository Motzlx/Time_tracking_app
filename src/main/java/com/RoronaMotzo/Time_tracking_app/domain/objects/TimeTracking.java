package com.RoronaMotzo.Time_tracking_app.domain.objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.time.LocalDateTime;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class TimeTracking extends AbstractPersistable<Long> {


    private LocalDateTime startTime;
    private LocalDateTime endTime;



}
