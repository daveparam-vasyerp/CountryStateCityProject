package com.CityStateCountryProject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CountryDto {

    private long countryId;
    private String countryName;

    public CountryDto(String countryName) {
        this.countryName = countryName;
    }
}
