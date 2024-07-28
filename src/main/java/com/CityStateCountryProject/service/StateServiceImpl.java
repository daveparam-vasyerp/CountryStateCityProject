package com.CityStateCountryProject.service;

import com.CityStateCountryProject.dto.StateDto;
import com.CityStateCountryProject.model.State;
import com.CityStateCountryProject.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceImpl implements StateService{

    @Autowired
    private StateRepository stateRepository;


    @Override
    public List<State> getAllStates() {
        return stateRepository.findAll();
    }

    @Override
    public State getStateByStateId(long stateId) {
        return stateRepository.findById(stateId).orElseThrow(()-> new RuntimeException("State is not found by this id"));
    }

    @Override
    public List<State> findByCountryId(long countryId) {
        return stateRepository.findStatesByCountryId(countryId);
    }

    @Override
    public List<State> findByCountryName(String CountryName) {
        return stateRepository.findByCountryName(CountryName);
    }

    @Override
    public State createState(StateDto stateDto) {
        State state = new State();
        state.setStateName(stateDto.getStateName());
        state.setBestCity(stateDto.getBestCity());
        stateRepository.save(state);
        return state;
    }

    @Override
    public String deleteState(long stateId) {
        stateRepository.deleteById(stateId);
        return "State is deleted successfully by id: "+stateId;
    }

}
