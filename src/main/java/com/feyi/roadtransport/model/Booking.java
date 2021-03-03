package com.feyi.roadtransport.model;


import lombok.Data;


import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String destination;
    private Timestamp bookingDate;
    private Timestamp departureTime;

    @ManyToOne
    private Booking booking;

}
