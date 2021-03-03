package com.feyi.roadtransport.service;


import com.feyi.roadtransport.model.Bus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BusService {

    void saveBus(Bus bus);

    void deleteBusById(Long Id);

    Optional<Bus> getBusById(Long Id);

    List<Bus> getAllBuses();

    Bus EditBus(Long Id, Bus bus);
}
