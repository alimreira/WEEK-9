package com.feyi.roadtransport.model;

import lombok.Data;
import lombok.Generated;


import javax.persistence.*;

@Data
@Entity
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numberOfSeats;
    private String plateNumber;
    private String color;
    private String name;

    @OneToOne
    private Driver driver;


}
