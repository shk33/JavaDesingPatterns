package com.head.first.book.observer.pattern.example1.main;

import com.head.first.book.observer.pattern.example1.displayers.CurrentConditionDisplay;
import com.head.first.book.observer.pattern.example1.displayers.ForecastDisplay;
import com.head.first.book.observer.pattern.example1.weather.WeatherData;

/**
 * Created by miguel on 28/06/15.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        //StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasuraments(80, 65, 30.4f);
        weatherData.setMeasuraments(82, 70, 29.2f);
        weatherData.setMeasuraments(78, 90, 31.4f);
    }
}
