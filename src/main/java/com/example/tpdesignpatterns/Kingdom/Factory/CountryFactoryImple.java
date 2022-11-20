package com.example.tpdesignpatterns.Kingdom.Factory;

import com.example.tpdesignpatterns.Kingdom.City;
import com.example.tpdesignpatterns.Kingdom.Country;

import java.util.ArrayList;
import java.util.List;

public class CountryFactoryImple implements CountryFactory{

    private static CountryFactoryImple instance = null;


    public static CountryFactory getInstance(){
        if(instance == null){
            instance = new CountryFactoryImple();
        }
        return instance;
    }

    @Override
    public Country buildCountry(String countryName, List<Integer> citizen, List<Integer> soldiers) {
        Country country = new Country();
        country.addCountryName(countryName);
        country.setCities(buildCity(citizen, soldiers));
        return country;
    }

    @Override
    public List<City> buildCity(List<Integer> citizen, List<Integer> soldiers) {
        List<City> cities = new ArrayList<>(citizen.size());
        for(int i = 0; i < citizen.size(); i++){
            City city = new City();
            city.setCitizen(citizen.get(i));
            city.setSoldiers(soldiers.get(i));
            cities.add(city);
        }
        return cities;

    }
}
