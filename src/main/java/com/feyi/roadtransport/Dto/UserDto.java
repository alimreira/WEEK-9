package com.feyi.roadtransport.Dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class UserDto {
    private Long Id;

    private String name;

    private String mobile;

    private String nextOfKin;

    private String nextOfKinMobile;

    private String nextOfKinAddress;

    private String email;

}
