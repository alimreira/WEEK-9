package com.feyi.roadtransport.service;

import com.feyi.roadtransport.model.Rating;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RatingService {
    void saveRating(Rating rating);

    void deleteRatingById(Long Id);

    Optional<Rating> getRatingById(Long Id);

    List<Rating> getAllRatings();

    Rating EditRating(Long Id, Rating rating);
}
