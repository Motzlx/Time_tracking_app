package com.RoronaMotzo.Time_tracking_app.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;


@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Order  extends AbstractPersistable<Long> {





}
