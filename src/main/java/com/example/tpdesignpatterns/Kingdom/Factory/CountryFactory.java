package com.example.tpdesignpatterns.Kingdom.Factory;

import com.example.tpdesignpatterns.Kingdom.City;
import com.example.tpdesignpatterns.Kingdom.Country;

import java.util.List;

public interface CountryFactory {
    public Country buildCountry(String countryName, List<Integer> citizen, List<Integer> soldiers);
    public List<City> buildCity(List<Integer> citizen, List<Integer> soldiers);
}
