package com.ugaHacksAudioTour.audio;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;



@RestController
@RequestMapping("/api/v1/park")
public class ParkControler {
    @Autowired
    private ParkService parkService;
    public ResponseEntity<List<Park>> getAllParks(){
        return new ResponseEntity<List<Park>>(parkService.allParks(), HttpStatus.OK);
    }

    @PostMapping
    public void createPark(@RequestBody Map<String,String[]> payload){
        parkService.createPark(payload.get("activities"),payload.get("addresses")[3],payload.get("addresses")[4],payload.get("fullName")[0],payload.get("id")[0],payload.get("images")[0],payload.get("standardHours"));
    }
    @GetMapping("/{parkId}")
    public ResponseEntity<Optional<Park>> getSinglePark(@PathVariable String id){
        return new ResponseEntity<Optional<Park>>(parkService.singlePark(id), HttpStatus.OK);
    }
}
