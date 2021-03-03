package com.feyi.roadtransport.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Data
@Entity
public class Driver extends Person {
    private String licenseNumber;
     @OneToOne
     private Bus bus;


}
