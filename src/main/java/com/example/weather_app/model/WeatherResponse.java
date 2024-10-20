package com.example.weather_app.model;

import lombok.Data;

import java.util.List;
@Data
public class WeatherResponse {
    private String name;

    private Sys sys;

    private List<Weather> weather;
    private Main main;
    private Wind wine;

    @Data
    public static  class  Sys{
        private  String country;

    }
    @Data
    public static class Weather{
        private int id;
        private String description;


    }
    @Data
    public static class Main{
        private double temp;
        private int humidity;

    }
    @Data
    public static class Wind{
        private double speed;


    }
}
