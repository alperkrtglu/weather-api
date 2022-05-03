package com.project.weatherapi.weather.controller.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class WeatherResponseDTO {
    private String name;
    private String country;
    private Double temperature;
    private LocalDateTime time;
}
