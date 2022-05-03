package com.project.weatherapi.weather.controller.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherClientResponseDTO {

    private String name;

    @JsonAlias(value = "sys")
    private SystemClientDTO systemClientDTO;

    @JsonAlias(value = "main")
    private MainClientDTO mainClientDTO;

}
