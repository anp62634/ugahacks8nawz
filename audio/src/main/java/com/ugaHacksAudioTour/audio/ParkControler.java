package com.ugaHacksAudioTour.audio;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/park")
public class ParkControler {
    public ResponseEntity<String> getAllParks(){
        return new ResponseEntity<String>(body"all Movies");
    }
}
