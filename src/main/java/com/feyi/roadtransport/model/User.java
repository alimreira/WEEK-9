package com.feyi.roadtransport.model;



import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
public class User extends Person{

    private String nextOfKin;
    private String nextOfKinMobile;
    private String nextOfKinAddress;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Ticket> ticket;

    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Booking> booking;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Comment> comment;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)

    private List<Rating> rating;
}
