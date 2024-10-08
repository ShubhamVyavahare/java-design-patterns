package com.sv.learning.core_patterns.adapter;

public class WeatherAdapter {

    public int findTemperature(int zipCode) {

        String city = null;

        if (zipCode == 19406)
            city = "King of Prussia";

        WeatherFinder finder = new WeatherFinderImpl();
        int temperature = finder.find(city);

        return temperature;
    }

}
