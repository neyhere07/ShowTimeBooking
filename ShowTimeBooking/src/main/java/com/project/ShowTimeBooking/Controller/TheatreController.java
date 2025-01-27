package com.project.ShowTimeBooking.Controller;

import com.project.ShowTimeBooking.RequestDTO.TheatreRequest;
import com.project.ShowTimeBooking.Service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("theatre")
public class TheatreController {
    @Autowired
    private TheatreService theatreService;

    @PostMapping("/add-theatre")
    public ResponseEntity addTheatre(@RequestBody TheatreRequest theatreRequest){
        try {
            return new ResponseEntity<>(theatreService.addTheatre(theatreRequest), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @DeleteMapping("/delete-theatre")
    public ResponseEntity deleteTheatre(@RequestParam String theatreCode){
        try {
            return new ResponseEntity<>(theatreService.deleteTheatre(theatreCode), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
