package com.core.patterns.structural.adapter;

public class WeatherAdapter {

    public int findTemperature(int zipcode) {
        String city = null;
        if (zipcode == 19406) {
            city = "King of Prussia";
        }

        WeatherFinder weatherFinder = new WeatherFinderImpl();
        int temperature = weatherFinder.find(city);

        return temperature;
    }
}
