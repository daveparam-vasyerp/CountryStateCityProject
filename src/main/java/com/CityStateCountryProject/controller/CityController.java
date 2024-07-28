package com.CityStateCountryProject.controller;

import com.CityStateCountryProject.dto.CityDto;
import com.CityStateCountryProject.model.City;
import com.CityStateCountryProject.model.State;
import com.CityStateCountryProject.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;



    @GetMapping("/getAllCities")
    public ResponseEntity<List<City>> getAllCities(){

        List<City> city =  cityService.getAllCities();
        return new ResponseEntity<>(city, HttpStatus.OK);
    }

    @GetMapping("/getCityById/{cityId}")
    public ResponseEntity<City> getCityById(@PathVariable long cityId){
        City city = cityService.findCityByCityId(cityId);
        return new ResponseEntity<>(city,HttpStatus.OK);
    }


    @GetMapping("/getCityByStateId/{stateId}")
    public ResponseEntity<List<City>> findByStateId(@PathVariable  long stateId){
        List<City> city = cityService.findByStateId(stateId);

        return new ResponseEntity<>(city,HttpStatus.OK);
    }


    @PostMapping("/createCity")
    public ResponseEntity<City> createCity(@RequestBody CityDto cityDto){

        City createCity = cityService.createCity(cityDto);
        return  new ResponseEntity<>(createCity,HttpStatus.CREATED);
    }
    @DeleteMapping("/deleteCity/{cityId}")

    public ResponseEntity<String> deleteCity(@PathVariable long cityId){
        String deleteCity = cityService.deleteCity(cityId);
        return new ResponseEntity<>(deleteCity,HttpStatus.OK);
    }

    @GetMapping("/findByStateName/{stateName}")
    public ResponseEntity<List<City>> findByStateName(@PathVariable String stateName){

        List<City> cityByStateName =  cityService.findByStateName(stateName);
        return new ResponseEntity<>(cityByStateName, HttpStatus.OK);
    }

}
