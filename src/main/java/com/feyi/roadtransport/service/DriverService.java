package com.feyi.roadtransport.service;

import com.feyi.roadtransport.Dto.DriverDto;
import com.feyi.roadtransport.model.Driver;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public interface DriverService {

    void saveDriver(DriverDto driverDto);

    void deleteDriverByEmail(String email);

    Optional<Driver> getDriverByName(String name);

    Optional<Driver> getDriverById(Long Id);

    List<Driver> getAllDrivers();

    Driver EditDriver(Long Id, Driver driver);
}
