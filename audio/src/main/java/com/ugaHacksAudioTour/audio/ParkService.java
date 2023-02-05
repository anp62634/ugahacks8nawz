package com.ugaHacksAudioTour.audio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParkService {
    @Autowired
    private ParkRepository parkRepository;

    @Autowired
    private MongoTemplate mongoTemplate;
    public List<Park> allParks(){
        return parkRepository.findAll();
    }


    public Optional<Park> singlePark(String parkId){
        return parkRepository.findByParkId(parkId);
    }

    public void createPark(String[] activities, String city, String stateCode, String fullName, String parkId, String imageUrl, String[] hours){
        parkRepository.save(new Park(activities,city,stateCode,fullName,parkId,imageUrl,hours));
    }


}

