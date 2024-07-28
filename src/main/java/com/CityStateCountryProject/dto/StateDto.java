package com.CityStateCountryProject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StateDto {



    private long stateId;
    private String stateName;
    private String bestCity;

    public StateDto(String stateName, String bestCity) {
        this.stateName = stateName;
        this.bestCity = bestCity;
    }
}
