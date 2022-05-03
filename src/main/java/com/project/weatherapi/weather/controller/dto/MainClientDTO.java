package com.project.weatherapi.weather.controller.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MainClientDTO {

    @JsonAlias(value = "temp")
    private Double temperature;

}
