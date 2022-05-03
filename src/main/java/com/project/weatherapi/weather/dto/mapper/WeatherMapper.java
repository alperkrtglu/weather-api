package com.project.weatherapi.weather.dto.mapper;

import com.project.weatherapi.weather.dto.WeatherClientResponseDTO;
import com.project.weatherapi.weather.dto.WeatherResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;

@Mapper(imports = LocalDateTime.class)
public interface WeatherMapper {

    WeatherMapper INSTANCE = Mappers.getMapper(WeatherMapper.class);

    @Mappings({
            @Mapping(target = "country", source = "systemClientDTO.country"),
            @Mapping(target = "temperature", source = "mainClientDTO.temperature"),
            @Mapping(target = "time", expression = "java(LocalDateTime.now())")
    })
    WeatherResponseDTO toDTO(WeatherClientResponseDTO dto);
}
