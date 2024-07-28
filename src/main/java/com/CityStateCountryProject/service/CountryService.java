package com.CityStateCountryProject.service;

import com.CityStateCountryProject.dto.CountryDto;
import com.CityStateCountryProject.model.Country;

import java.util.List;

public interface CountryService {
    public List<Country> getAllCountries();

    public Country getCountryById(long countryId);

    public Country createCountry(CountryDto countryDto);

    public String deleteCountry(long countryId);
}
