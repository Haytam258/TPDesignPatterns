package com.example.tpdesignpatterns.Kingdom;

import java.util.ArrayList;
import java.util.List;

public class Country {

    private String countryName;
    private List<City> cities;

    public String getCountryName(){
        return this.countryName;
    }

    public void addCountryName(String countryName){
        this.countryName = countryName;
    }

    public List<City> getCities(){
        return this.cities;
    }

    public void setCities(List<City> cities){
        this.cities = cities;
    }

}
