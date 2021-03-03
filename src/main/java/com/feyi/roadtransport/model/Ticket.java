package com.feyi.roadtransport.model;


import lombok.Data;


import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Timestamp salesTime;
    private Timestamp journeyDate;
    private String departureStation;
    private String arrivalStation;
    private int seatReserved;
    private int price;

    @ManyToOne
    private User user;



}
