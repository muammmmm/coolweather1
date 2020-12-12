package com.example.weather.util;

import com.example.weather.gson.Weather;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Utility
{

    public static Weather handleWeatherResponse(String weatherString)
    {
        try
        {
            JSONObject jsonObject=new JSONObject(weatherString);
            JSONArray jsonArray=jsonObject.getJSONArray("weather");
            String weatherContent=jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(weatherContent,Weather.class);
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}