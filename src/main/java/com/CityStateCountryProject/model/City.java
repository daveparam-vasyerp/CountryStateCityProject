package com.CityStateCountryProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "city_table")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private long cityId;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "city_population")
    private long cityPopulation;

    @ManyToOne
    @JoinColumn(name = "state_id")
    @JsonIgnore
    private State state;



}
