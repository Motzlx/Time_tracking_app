package com.RoronaMotzo.Time_tracking_app.domain.objects;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table
@Builder
public class MileStone extends AbstractPersistable<Long> {



    private LocalDateTime       finishingTimeStamp;
    private LocalDateTime       creationTimeStamp;
    private String              mileStoneName;



}
