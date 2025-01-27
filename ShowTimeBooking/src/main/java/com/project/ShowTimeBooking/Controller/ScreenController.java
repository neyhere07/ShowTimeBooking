package com.project.ShowTimeBooking.Controller;

import com.project.ShowTimeBooking.RequestDTO.ScreenRequest;
import com.project.ShowTimeBooking.Service.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("screen")
public class ScreenController {
    @Autowired
    private ScreenService screenService;

    @PostMapping("/add-screens")
    public ResponseEntity addScreens(@RequestParam String theatreCode, @RequestBody List<ScreenRequest> screenRequestList){
        try {
            return new ResponseEntity<>(screenService.addScreens(theatreCode, screenRequestList), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    @DeleteMapping("/delete-screen")
    public ResponseEntity deleteScreen(@RequestParam String theatreCode, @RequestParam String screenNumber){
        try {
            return new ResponseEntity(screenService.deleteScreen(theatreCode, screenNumber), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
