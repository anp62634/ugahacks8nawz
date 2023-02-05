package com.ugaHacksAudioTour.audio;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParkRepository extends MongoRepository<Park, ObjectId> {
    Optional<Park> findByParkId(String parkId);
}
