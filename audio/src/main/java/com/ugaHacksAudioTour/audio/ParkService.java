package com.ugaHacksAudioTour.audio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkService {
    @Autowired
    private ParkRepository parkRepository;
    public list<Park> allParks(){
        return parkRepository.findAll()
    }
}
