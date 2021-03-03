package com.feyi.roadtransport.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private int rate;

    @ManyToOne
    private User user;
}
