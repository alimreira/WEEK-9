package com.feyi.roadtransport.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@MappedSuperclass
abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Timestamp regTime;
    private String password;
    private String mobile;

    @Column(unique = true)
    private String email;


    private boolean deleted;


}
