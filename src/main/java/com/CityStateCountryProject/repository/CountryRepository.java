package com.CityStateCountryProject.repository;

import com.CityStateCountryProject.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Long> {

    Optional<Country> findByCountryName(String countryName);



}