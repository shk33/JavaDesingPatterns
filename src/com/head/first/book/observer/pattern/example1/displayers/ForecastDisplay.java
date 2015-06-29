package com.head.first.book.observer.pattern.example1.displayers;

import com.head.first.book.observer.pattern.example1.weather.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by miguel on 29/06/15.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Pressure "+ currentPressure + " Last Pressure "+lastPressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
