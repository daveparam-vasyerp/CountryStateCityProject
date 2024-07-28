package com.CityStateCountryProject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CityDto {

    private long cityId;
    private String cityName;
    private long cityPopulation;

    public CityDto(String cityName, long cityPopulation) {
        this.cityName = cityName;
        this.cityPopulation = cityPopulation;
    }
}
