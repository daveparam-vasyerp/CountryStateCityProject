package com.CityStateCountryProject.controller;

import com.CityStateCountryProject.dto.CountryDto;
import com.CityStateCountryProject.model.Country;
import com.CityStateCountryProject.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/getAllCountries")
    public ResponseEntity<List<Country>> getAllCountries(){

        List<Country> country =  countryService.getAllCountries();
        return new ResponseEntity<>(country, HttpStatus.OK);
    }

    @GetMapping("/getCountryById/{countryId}")
    public ResponseEntity<Country> getCountryById(@PathVariable long countryId){
        Country country = countryService.getCountryById(countryId);
        return new ResponseEntity<>(country,HttpStatus.OK);
    }

    @PostMapping("/createCountry")
    public ResponseEntity<Country> createCountry(@RequestBody CountryDto countryDto){

        Country createCountry = countryService.createCountry(countryDto);
        return  new ResponseEntity<>(createCountry,HttpStatus.CREATED);
    }
    @DeleteMapping("/deleteCountry/{countryId}")

    public ResponseEntity<String> deleteCountry(@PathVariable long countryId){
        String deleteCountry = countryService.deleteCountry(countryId);
        return new ResponseEntity<>(deleteCountry,HttpStatus.OK);
    }
}
