package com.SelfDevelopment.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityResponse {
    private String name;
    private String  countryCode;
    private String  district;
    private String population;
}
