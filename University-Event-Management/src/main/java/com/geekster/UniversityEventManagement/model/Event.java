package com.geekster.UniversityEventManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Event {
    @Id
    private Long eventId;
    @NotBlank(message = "Event name can not be blank")
    private String eventName;

    @Column(name = "location")
    @NotBlank(message = "Location can not be blank")
    private String eventLocation;

    @Column(name = "date")

    private LocalDate eventDate;

    @Column(name = "startTime")
    @NotBlank(message = "Time can not be blank")
    private String eventStartTime;

    @NotBlank(message = "Time can not be blank")
    @Column(name = "endTime")
    private String eventEndTime;
}
