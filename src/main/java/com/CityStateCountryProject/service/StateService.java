package com.CityStateCountryProject.service;

import com.CityStateCountryProject.dto.StateDto;
import com.CityStateCountryProject.model.State;

import java.util.List;

public interface StateService {

    public List<State> getAllStates();

    public State getStateByStateId(long stateId);

    public List<State> findByCountryName(String CountryName);

    public List<State> findByCountryId(long countryId);

    public State createState(StateDto stateDto);

    public String deleteState(long stateId);
}
