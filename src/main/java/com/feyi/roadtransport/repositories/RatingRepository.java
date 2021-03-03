package com.feyi.roadtransport.repositories;

import com.feyi.roadtransport.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating,Long> {
}
