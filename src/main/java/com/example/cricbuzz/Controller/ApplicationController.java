package com.example.cricbuzz.Controller;

import com.example.cricbuzz.Models.Series;
import com.example.cricbuzz.Services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class ApplicationController {
    private final IService service;

    @Autowired
    public ApplicationController(IService service) {
        this.service = service;
    }

    @GetMapping("/domestic")
    ResponseEntity<List<Series>> getDomesticSeries(){
        List<Series> series = service.getDomesticMatches();
        if(series.isEmpty()) return new ResponseEntity<>(series, HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(series, HttpStatus.OK);
    }


    @GetMapping("/international")
    ResponseEntity<List<Series>> getInternationalSeries() {
        List<Series> series = service.getInternationalMatches();
        if(series.isEmpty()) return new ResponseEntity<>(series, HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(series, HttpStatus.OK);
    }
}
