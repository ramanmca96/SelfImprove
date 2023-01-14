package com.SelfDevelopment.service;

import com.SelfDevelopment.dto.request.CityRequest;
import com.SelfDevelopment.dto.response.CityResponse;

public interface CityService {
CityResponse createCityDetails(CityRequest cityRequest);
}
