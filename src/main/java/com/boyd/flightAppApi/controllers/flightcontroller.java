package com.boyd.flightAppApi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.boyd.flightAppApi.models.flight;
import com.boyd.flightAppApi.repositories.flightrepository;

@RestController
@RequestMapping("/api/flights")

public class flightcontroller {
    @Autowired
    private flightrepository repo;

    @GetMapping
    public List<flight> findAllFlights(){
        return repo.findAll();

    }

    @GetMapping("/{id}")
    public ResponseEntity<flight> findFlightByID(@PathVariable(value = "id") long Id){
        Optional<flight> flights = repo.findById(Id);
        if(flights.isPresent()){
            return ResponseEntity.ok().body(flights.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping

    public flight saveFlight(@Validated @RequestBody flight f){
        return repo.save(f);
    }
}
 