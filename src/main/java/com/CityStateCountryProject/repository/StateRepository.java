package com.CityStateCountryProject.repository;

import com.CityStateCountryProject.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface StateRepository extends JpaRepository<State, Long> {

    @Query(value = "select * from state_table where country_id= ?1",nativeQuery = true)
    List<State> findStatesByCountryId(long countryId);

    Optional<State> findByStateName(String stateName);

    @Query(value = "select st.* from state_table st left join  country_table cot on st.country_id = cot.country_id where cot.country_name= ?1",nativeQuery = true)
    List<State> findByCountryName(String countryName);


}