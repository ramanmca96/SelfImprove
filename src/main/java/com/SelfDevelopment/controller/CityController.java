package com.SelfDevelopment.controller;

import com.SelfDevelopment.dto.request.CityRequest;
import com.SelfDevelopment.dto.response.CityResponse;
import com.SelfDevelopment.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.SelfDevelopment.Constant.ServiceConstant.CITY_BASE_URL;

@RestController

public class CityController {
    @Autowired
    CityService cityService;
@PostMapping("/createCity")
    public CityResponse createCity(@RequestParam CityRequest cityRequest){
        CityResponse cityResponse = cityService.createCityDetails(cityRequest);
        return cityResponse;
    }
}
