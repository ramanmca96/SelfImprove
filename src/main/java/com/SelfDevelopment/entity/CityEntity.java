package com.SelfDevelopment.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "city")
public class CityEntity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name = "Name")
    private String name;

    @Column(name = "CountryCode")
    private String  countryCode;

    @Column(name = "District")
    private String  district;

    @Column(name = "Population")
    private String population;
}
