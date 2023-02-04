package com.ugaHacksAudioTour.audio;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/park")
public class ParkControler {
    @Autowired
    private ParkService parkService;
    public ResponseEntity<String> getAllParks(){
        return new ResponseEntity<List<Park>>(parkService.allParks(),HttpStatus.ok);
        }
    }
    @GetMapping("/{parkId}")
    public ResponseEntity<Optional<Park>> getSinglePark(@PathVariable ObjectId id){
        return new ResopnceEntity<Optional<Park>>(parkService.singlePark(id), HttpStatus.ok);
    }
}
