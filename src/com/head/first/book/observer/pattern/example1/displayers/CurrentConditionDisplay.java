package com.head.first.book.observer.pattern.example1.displayers;
import com.head.first.book.observer.pattern.example1.weather.HeatIndexDisplay;
import com.head.first.book.observer.pattern.example1.weather.WeatherData;

import java.util.Observable;
import java.util.Observer;
/**
 * Created by miguel on 28/06/15.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    private HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay();

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+ temperature + "F degrees and "+ humidity + "% humidity");
        System.out.println("Heat Index is "+heatIndexDisplay.computeHeatIndex(temperature, humidity));
    }
}
