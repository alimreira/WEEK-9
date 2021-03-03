package com.feyi.roadtransport.model;


import lombok.Data;


import javax.persistence.*;

@Data
@Entity

public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String routeName;

    @ManyToOne
    private Terminal terminal;



}
