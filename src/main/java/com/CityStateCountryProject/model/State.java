package com.CityStateCountryProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "state_table")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "state_id")
    private long stateId;

    @Column(name = "state_name")
    private String stateName;

    @Column(name = "best_city")
    private String bestCity;

    @ManyToOne
    @JoinColumn(name = "country_id")
    @JsonIgnore
    private Country country;

    @OneToMany(mappedBy = "state",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<City> cities;

}
