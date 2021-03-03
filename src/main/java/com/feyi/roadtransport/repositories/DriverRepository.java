package com.feyi.roadtransport.repositories;

import com.feyi.roadtransport.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,Long> {
}
