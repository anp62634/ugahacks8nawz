package com.ugaHacksAudioTour.audio;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkRepository extends MongoRepository<Park, ObjectId> {
    Optional<Park> findParkByParkId(String parkId);
}
