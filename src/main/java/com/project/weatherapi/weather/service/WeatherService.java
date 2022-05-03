package com.project.weatherapi.weather.service;

import com.project.weatherapi.weather.dto.WeatherClientResponseDTO;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Data
@RequiredArgsConstructor
public class WeatherService {

    private final RestTemplate restTemplate;

    @Value("${api.openweathermap.appId}")
    private String appId;

    @Value("${api.openweathermap.city}")
    private String city;

    @Value("${api.openweathermap.url}")
    private String url;

    @Cacheable(value = "weather", key = "{@weatherService.city}")
    public WeatherClientResponseDTO getWeather() {
        return restTemplate.getForObject(url, WeatherClientResponseDTO.class, city, appId);
    }
}
