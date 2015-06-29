package com.head.first.book.observer.pattern.example1.weather;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by miguel on 28/06/15.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){}

    public void measuramentsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasuraments(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measuramentsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
