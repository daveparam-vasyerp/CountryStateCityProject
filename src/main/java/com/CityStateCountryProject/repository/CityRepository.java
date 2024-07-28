package com.CityStateCountryProject.repository;

import com.CityStateCountryProject.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface CityRepository extends JpaRepository<City, Long> {



        @Query(value = "select * from city_table where state_id = ?1",nativeQuery = true)
    List<City> findCitiesByStateId(long stateId);


    @Query(value = "select c.* from city_table c left join state_table s on c.state_id = s.state_id where s.state_name = ?1",nativeQuery = true)
   public List<City> findCitiesByStateName(String stateName);

}