package com.feyi.roadtransport.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity


public class Terminal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String terminalName;

    @OneToMany(mappedBy = "terminal", cascade = CascadeType.ALL)
    private List<Route> route;
}


