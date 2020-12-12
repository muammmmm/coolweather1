package com.example.weather.db;
import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport
{
    private String cityName;//市名

    public City(String cityName)
    {
        this.cityName = cityName;
    }
    public City() { }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
