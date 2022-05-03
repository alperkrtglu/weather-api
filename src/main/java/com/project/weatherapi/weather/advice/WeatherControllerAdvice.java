package com.project.weatherapi.weather.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.SocketTimeoutException;

@RestControllerAdvice
public class WeatherControllerAdvice {

    @ExceptionHandler(value = SocketTimeoutException.class)
    @ResponseStatus(value = HttpStatus.REQUEST_TIMEOUT)
    public String handlerSocketTimeoutException() {
        return "The request has exceeded the time limit.";
    }
}
