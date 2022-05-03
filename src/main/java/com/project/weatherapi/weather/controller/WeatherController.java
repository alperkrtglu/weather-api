package com.project.weatherapi.weather.controller;

import com.project.weatherapi.weather.dto.WeatherResponseDTO;
import com.project.weatherapi.weather.dto.mapper.WeatherMapper;
import com.project.weatherapi.weather.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherResponseDTO weather() {
        return WeatherMapper.INSTANCE.toDTO(weatherService.getWeather());
    }
}
