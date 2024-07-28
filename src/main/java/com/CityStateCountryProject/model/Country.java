package com.CityStateCountryProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "country_table")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private long countryId;

    @Column(name = "country_name")
    private String countryName;

    @OneToMany(mappedBy = "country",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<State> states;

}

