package com.SelfDevelopment.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityRequest {
    private String name;
    private String  countryCode;
    private String  district;
    private String population;
}
