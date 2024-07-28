package com.CityStateCountryProject.controller;

import com.CityStateCountryProject.dto.CityDto;
import com.CityStateCountryProject.dto.StateDto;
import com.CityStateCountryProject.model.City;
import com.CityStateCountryProject.model.State;
import com.CityStateCountryProject.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/state")
public class StateController {


    @Autowired
    private StateService stateService;


    @GetMapping("/getAllStates")
    public ResponseEntity<List<State>> getAllStates(){

        List<State> state =  stateService.getAllStates();
        return new ResponseEntity<>(state, HttpStatus.OK);
    }

    @GetMapping("/getStateById/{stateId}")
    public ResponseEntity<State> getStateById(@PathVariable long stateId){
        State state = stateService.getStateByStateId(stateId);
        return new ResponseEntity<>(state,HttpStatus.OK);
    }


    @GetMapping("/getStateByCountryId/{countryId}")
    public ResponseEntity<List<State>> findByStateId(@PathVariable  long countryId){
        List<State> state = stateService.findByCountryId(countryId);
        return new ResponseEntity<>(state,HttpStatus.OK);
    }


    @PostMapping("/createState")
    public ResponseEntity<State> createState(@RequestBody StateDto stateDto){

        State createState = stateService.createState(stateDto);
        return  new ResponseEntity<>(createState,HttpStatus.CREATED);
    }
    @DeleteMapping("/deleteState/{stateId}")

    public ResponseEntity<String> deleteState(@PathVariable long stateId){
        String deleteState = stateService.deleteState(stateId);
        return new ResponseEntity<>(deleteState,HttpStatus.OK);
    }

    @GetMapping("/findByCountryName/{countryName}")
    public ResponseEntity<List<State>> findByCountryName(@PathVariable String countryName){

        List<State> state =  stateService.findByCountryName(countryName);
        return new ResponseEntity<>(state, HttpStatus.OK);
    }
}
