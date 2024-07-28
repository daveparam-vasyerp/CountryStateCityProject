package com.CityStateCountryProject.service;

import com.CityStateCountryProject.dto.CityDto;
import com.CityStateCountryProject.model.City;
import com.CityStateCountryProject.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public City findCityByCityId(long cityId) {
        return cityRepository.findById(cityId).orElseThrow(()-> new RuntimeException("City is not found by this id"));
    }

    @Override
    public List<City> findByStateId(long stateId) {
        return cityRepository.findCitiesByStateId(stateId);
    }

    @Override
    public List<City> findByStateName(String stateName) {
        return cityRepository.findCitiesByStateName(stateName);
    }

    @Override
    public City createCity(CityDto cityDto) {
        City city = new City();
        city.setCityName(cityDto.getCityName());
        city.setCityPopulation(cityDto.getCityPopulation());
        cityRepository.save(city);
        return city;
    }

    @Override
    public String deleteCity(long cityId) {
        cityRepository.deleteById(cityId);
        return "City is deleted successfully by id : "+cityId;
    }

}
