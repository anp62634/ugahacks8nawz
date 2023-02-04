package com.ugaHacksAudioTour.audio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkService {
    @Autowired
    private ParkRepository parkRepository;

    @Autowired
    private MongoTemplate mongoTemplate;
    public list<Park> allParks(){
        return parkRepository.findAll()
    }


    public Optional<Park> singleMovie(String parkId){
        return parkRepository.findByParkId(parkId);
    }

    public Park createPark(String[] activities, String city, String stateCode, String fullName, String parkId, String imageUrl, String url){

    }


}
