package com.project.weatherapi.weather.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class WeatherAspect {

    @Before("execution(* com.project.weatherapi.weather.service.WeatherService.getWeather(..))")
    public void WeatherPointCut(JoinPoint joinPoint) {
        log.info("Rest-api called! -> " + joinPoint.getSignature().getName());
    }
}
