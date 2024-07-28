package com.CityStateCountryProject.service;

import com.CityStateCountryProject.dto.CityDto;
import com.CityStateCountryProject.model.City;

import java.util.List;

public interface CityService {

    public List<City> getAllCities();
    public City findCityByCityId(long cityId);


    public List<City> findByStateId(long stateId);

    public List<City> findByStateName(String stateName);

    public City createCity(CityDto cityDto);

    public String deleteCity(long cityId);

}
