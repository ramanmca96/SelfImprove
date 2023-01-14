package com.SelfDevelopment.service.Impl;

import com.SelfDevelopment.dto.request.CityRequest;
import com.SelfDevelopment.dto.response.CityResponse;
import com.SelfDevelopment.entity.CityEntity;
import com.SelfDevelopment.repository.CityRepository;
import com.SelfDevelopment.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    CityRepository cityRepository;
    @Override
    public CityResponse createCityDetails(CityRequest cityRequest) {
        CityResponse cityResponse = new CityResponse();
        CityEntity cityEntity = new CityEntity();

        cityEntity.setName(cityRequest.getName());
        cityEntity.setDistrict(cityRequest.getDistrict());
        cityEntity.setCountryCode(cityRequest.getCountryCode());
        cityEntity.setPopulation(cityRequest.getPopulation());

        cityRepository.save(cityEntity);

        cityResponse.setName(cityEntity.getName());
        cityResponse.setDistrict(cityEntity.getDistrict());
        cityResponse.setCountryCode(cityEntity.getCountryCode());
        cityResponse.setPopulation(cityEntity.getPopulation());
        return cityResponse;
    }
}
