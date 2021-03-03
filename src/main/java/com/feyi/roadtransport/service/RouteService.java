package com.feyi.roadtransport.service;

import com.feyi.roadtransport.model.Route;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RouteService {

    void saveRoute(Route route);

    void deleteRouteById(Long Id);

    Optional<Route> getRouteByName(String name);

    Optional<Route> getRouteById(Long Id);

    List<Route> getAllRoutes();

    Route EditRoute(Long Id, Route route);

}
