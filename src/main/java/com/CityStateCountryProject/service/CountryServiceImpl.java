package com.CityStateCountryProject.service;

import com.CityStateCountryProject.dto.CountryDto;
import com.CityStateCountryProject.model.Country;
import com.CityStateCountryProject.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CountryServiceImpl implements CountryService{

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Country getCountryById(long countryId) {
        return countryRepository.findById(countryId).orElseThrow(()-> new RuntimeException("Country is not found by this id"+countryId));
    }

    @Override
    public Country createCountry(CountryDto countryDto) {
        Country country = new Country();
        country.setCountryName(countryDto.getCountryName());
        countryRepository.save(country);
        return country;
    }

    @Override
    public String deleteCountry(long countryId) {
        countryRepository.deleteById(countryId);
        return "country is deleted by id: "+countryId;
    }
}
